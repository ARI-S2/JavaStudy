package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class MainClass_1 {

	public static void main(String[] args) {
		try {
			String html = "<html>"
					+"<body>"
					+"<div id = aaa>"
					+"<div class = bbb>hello java1</div>"
					+"<a href = daum.net></a>"
					+ "</div>"
					+"<div id =ccc>"
					+"<div class = ddd>Hello java2</div>"
					+"<img src = aaa.png>"
					+"</div>"
					+"<div class = kkk>"
					+"<div>Spring</div>"
					+"<div class = kkk>"
					+"<div>Oracle</div>"
					+"<div>"
					+"</body>"
					+"</html>";
			// id => #, class => .
			Document doc = Jsoup.parse(html,"UTF-8");
			Element elem = doc.selectFirst("div#aaa div.bbb");
			System.out.println(elem.text());
			
			Element elem2 = doc.selectFirst("div#ccc img");
			System.out.println(elem2.attr("src"));
			
			Element elem3 = doc.selectFirst("");
		}catch (Exception e) {
			
		}

	}

}
