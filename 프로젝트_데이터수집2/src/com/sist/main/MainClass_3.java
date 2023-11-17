package com.sist.main;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class MainClass_3 {

	public static void main(String[] args) {
		try {
			// id => #, class => .
			Document doc = Jsoup.connect("https://movie.daum.net/ranking/ott").get();
			Elements link = doc.select("div.detail_rankinginfo ol.aniposter_ott strong.tit_item a");
			
			// img , a 태그 같이 태그명에 속성값 있으면 태그만 쓰고 attr() 속성값에 속성이름 추가 해줌
			String regdate="개봉일 정보 없음",genre="장르 정보 없음",nation="국가 정보 없음",grade="장르 정보 없음",time="러닝타임 정보 없음",score="평점 정보 없음",make_share="누적관객 정보 없음";


			for(int i = 0; i<link.size();i++) {
				System.out.println(link.get(i).attr("href"));
				
				String subLink = "https://movie.daum.net"
				+link.get(i).attr("href");
				System.out.println(subLink);
				Document doc2 = Jsoup.connect(subLink).get();
				
				// 한개만 가져옴
				Element title = doc2.selectFirst("div.detail_tit h3.tit_movie span.txt_tit");
				
				 Element poster = doc2.selectFirst("div.info_poster span.bg_img");
					String image ="";
					try {
					image = poster.attr("style");
					image = image.substring(image.indexOf("(")+1
							,image.lastIndexOf(")") );
					}catch (Exception e) {
						image = "이미지 없음";
					}
					
				Elements etc= doc2.select("dl.list_cont dt");
				 for(int a=0;a<etc.size();a++)
			       {
			    	   String ss=etc.get(a).text();
			    	   if(ss.equals("개봉"))
			    	   {
			    		   Element e=doc2.select("dl.list_cont dd").get(a);
			    		   regdate=e.text();
			    	   }
			    	   else if(ss.equals("장르"))
			    	   {
			    		   Element e=doc2.select("dl.list_cont dd").get(a);
			    		   genre=e.text();
			    	   }
			    	   else if(ss.equals("국가"))
			    	   {
			    		   Element e=doc2.select("dl.list_cont dd").get(a);
			    		   nation=e.text();
			    	   }
			    	   else if(ss.equals("등급"))
			    	   {
			    		   Element e=doc2.select("dl.list_cont dd").get(a);
			    		   grade=e.text();
			    	   }
			    	   else if(ss.equals("러닝타임"))
			    	   {
			    		   Element e=doc2.select("dl.list_cont dd").get(a);
			    		   time=e.text();
			    	   }
			    	   else if(ss.equals("평점"))
			    	   {
			    		   Element e=doc2.select("dl.list_cont dd").get(a);
			    		   score=e.text();
			    	   }
			    	   else if(ss.equals("누적 관객"))
			    	   {
			    		   Element e=doc2.select("dl.list_cont dd").get(a);
			    		   make_share=e.text();
			    	   }
	
			       }
			
					String msg = title.text() +"|"
					+ image +"|"
					+ regdate +"|"
					+ genre +"|"
					+ nation +"|"
					+ grade +"|"
					+ time +"|"
					+ score +"|"
					+ make_share +"|";
				msg = msg.substring(0,msg.lastIndexOf("|"));
				msg += "\r\n";				 
				System.out.println(msg); 
				
				FileWriter fw = new FileWriter("C:\\java_data\\DaumMovie_OTT.txt",true);
				fw.write(msg);
				fw.close();
				 
//					String temp = "";
//					for(int j = 0; j<etc.size(); j++) {
//						temp += etc.get(j).text()+"|"
//								+ regdate
//								+ genre
//								+ nation
//								+ grade
//								+ time
//								+ score
//								+ make_share;
//						System.out.println(etc.get(j).text());
//						System.out.println(temp);
					//}
					
					//System.out.println(image);
				 
//				System.out.println(title.text());
//				Element state = doc2.selectFirst("h3.tit_movie span.txt_state");
//				System.out.println(state.text());
//				// 필요한 값은 <dd> </dd>
//				//Elements detail = doc2.select("div.detail_cont dl.list_cont dd");
//				//System.out.println(detail);
//				
//				//Element dd1 = doc2.selectFirst("div.detail_cont dl.list_cont dd").get(0);
//				
//				
//				String temp = "";
//				for(int j = 0; j<detail.size(); j++) {
//					temp += detail.get(j).text()+"|";
//					System.out.println(detail.get(j).text());
//					//System.out.println();
//				}
//				
//				Element poster = doc2.selectFirst("div.info_poster span.bg_img");
//				String image ="";
//				try {
//				image = poster.attr("style");
//				image = image.substring(image.indexOf("(")+1
//						,image.lastIndexOf(")") );
//				}catch (Exception e) {
//					image = "이미지 없음";
//				}
//				//
//				//System.out.println(image);
//				
//				
//				String msg = (i+1)+"|"
//							+ title.text() +"|"
//							+ state.text() +"|"
//							+ image +"|"
//							+ temp;
//				msg = msg.substring(0,msg.lastIndexOf("|"));
//				msg += "\r\n";
//				
//				FileWriter fw = new FileWriter("C:\\java_data\\movie.txt",true);
//				fw.write(msg);
//				fw.close();
//				
			}
			
		
		}catch (Exception e) {
			
		

	}

}
}
