import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;

/*
 * 
밑변 * 2
옆변 = 네모 갯수

n = int(input())
 

1
4

3
12

 */
public class 연산자정리 {

	public static void main(String[] args) throws Exception { 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("검색어 입력: ");
		String fd = sc.next();
		
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title = doc.select("a.title");
		Elements singer = doc.select("a.artist");
		for (int i =0; i<50; i++) {
			if(title.get(i).text().contains(fd)) {
				
			System.out.println(title.get(i).text()
					+ "("+singer.get(i).text()+")" );
			}

		}

	}
}
