package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
// 가장 큰 태그를 먼저 가져오고 특정되는 작은 태그부터 가져와서 중복되먄 그 상위 태그를 하나씩 추가함 
public class MainClass_2 {

	public static void main(String[] args) {
		try {
			// id => #, class => .
			Document doc = Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements title = doc.select("div.section_ranking strong.tit_item");
			// img , a 태그 같이 태그명에 속성값 있으면 태그만 쓰고 attr() 속성값에 속성이름 추가 해줌
			Elements poster = doc.select("div.section_ranking div.poster_movie img");
			Elements grade = doc.select("div.section_ranking span.txt_tag");
			Elements avg = doc.select("div.section_ranking span.txt_grade");
			// 중복 태그가 있을 시 위에 특정되는 태그 더 끌고옴
			Elements rev = doc.select("div.section_ranking span.txt_append span.txt_num");
			Elements tcnt = doc.select("div.section_ranking strong.tit_item a");
			
			for(int i = 0; i<title.size();i++) {
				System.out.println(title.get(i).text());
				System.out.println(poster.get(i).attr("src"));
				System.out.println(grade.get(i).text());
				System.out.println(avg.get(i).text());
				System.out.println(rev.get(i).text());
				System.out.println(tcnt.get(i).attr("href"));
				System.out.println();
			}
			
		
		}catch (Exception e) {
			
		}

	}

}
