package com.sist.main;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class MainClass_4 {

	public static void main(String[] args) {
		try {
			// id => #, class => .
			Document doc = Jsoup.connect("https://www.gangwon.to/gwtour/only/attraction?catgry=%EC%9E%90%EC%97%B0").get();
			Elements link = doc.select("div.list-type-col3 a");
			// img , a 태그 같이 태그명에 속성값 있으면 태그만 쓰고 attr() 속성값에 속성이름 추가 해줌
			
			
			for(int i = 0; i<link.size();i++) {
				System.out.println(link.get(i).attr("href"));
//				
//				String subLink = "https://movie.daum.net"
//				+link.get(i).attr("href");
//				System.out.println(subLink);
//				Document doc2 = Jsoup.connect(subLink).get();
//				
//				// 한개만 가져옴
//				Element title = doc2.selectFirst("h3.tit_movie span.txt_tit");
//				System.out.println(title.text());
//				Element state = doc2.selectFirst("h3.tit_movie span.txt_state");
//				System.out.println(state.text());
//				// 필요한 값은 <dd> </dd>
//				Elements detail = doc2.select("div.detail_cont dl.list_cont dd");
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
				
			}
			
		
		}catch (Exception e) {
			
		

	}

}
}
