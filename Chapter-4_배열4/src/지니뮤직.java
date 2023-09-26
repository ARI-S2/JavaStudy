/*
 * 1. equals => 대소문자 구분
   => equalsIgnoreCase => 대소문자 미구분
 * 						boolean
 * 					   ------- if믄에서 사용
 * 						equals() == 
 * 						!equals() !=
 * 2. contains : 포함된 문자 찾기 => boolean
 * 3. startsWith : 시작 문자열이 같은 경우 => boolean
 * 4. endssWith : 시작 문자열이 같은 경우 => boolean
 * -------------------------------------------- 검색
 */	
import java.util.*;

import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 지니뮤직 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String url = "";
		while(true) {
			System.out.println("========메뉴==========");
			System.out.println("1. TOP 50");
			System.out.println("2. 가요");
			System.out.println("3. POP");
			System.out.println("4. OST");
			System.out.println("5. 트롯");
			System.out.println("6. JAZZ");
			System.out.println("7. CLASSIC");
			System.out.println("8. CONSTAINS");
			System.out.println("9. startsWith");
			System.out.println("10. endsWith");
			System.out.println("11. EXIT");
			System.out.println("=====================");
			System.out.print("메뉴 선택: ");
			
			int m = sc.nextInt();
			
			if(m == 11) {
				System.out.println("프로그램 종료!!");
				break;
			}
			else if(m == 1) {
				url = "https://www.genie.co.kr/chart/top200";
			}
			else if(m == 2) {
				url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0100";
			}
			else if(m == 3) {
				url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0200";
			}
			else if(m == 4) {
				url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0300";
			}
			else if(m == 5) {
				url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0107";
			}
			else if(m == 6) {
				url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0500";
			}
			else if(m == 7) {
				url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0600";
			}
			
			System.out.println("검색어 입력: ");
			String msg = sc.next();
			
			Document doc = Jsoup.connect(url).get(); // 개발자 모드로한 html 코드 소스 다 읽어들여옴
			Elements title = doc.select("table.list-wrap a.title"); 
			for(int i =0; i < title.size(); i++) {
				String name = title.get(i).text();
//				System.out.println( (i+1) + "." + title.get(i).text() );
				if(name.equalsIgnoreCase(msg)) { // contains => 포함 / startsWith => 시작 / endsWith => 끝나는
					System.out.println((i+1)+"."+name);
					Thread.sleep(1000);
				}
			}
		
		}

		
		}

}
