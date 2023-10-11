//
/*
 * 1|
 * 쇼생크 탈출|
 * 드라마|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 15세 관람가|
 * 프랭크 다라본트
 */
import java.io.FileReader;
import java.util.Scanner;

class Movie{
	int movie_no;
	String title; 
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String directer;
}

// System이 나오면 기능클래스(액션클래스)
class MovieSystem{
	static Movie[] ms = new Movie[1938]; //아직 객체 생성 안됨 => 빈 배열만 생성
	
	// 1. 초기화
	MovieSystem() {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			
			StringBuffer data = new StringBuffer();
			//String data = ""; // 하나씩 읽어들여서 저장할 통 데이터
			int i = 0; //하나씩 읽어드려서 저장할 변수
			while((i = fr.read()) != -1) {
				//data += (char)i; //char변환 필요
				data.append((char)i);
			}
			fr.close();
			
			String[] datas = data.toString().split("\n"); //한 줄씩 짤라서 배열에 저장 | toString()으로 char에서 문자열 변환
			
			i = 0;
			for(String s : datas) { //한줄씩 가져와서 한개식 짜름
				String[] ss = s.split("\\|");
				ms[i] = new Movie(); // i번 객체 생성
				
				ms[i].movie_no = Integer.parseInt(ss[0]);
				ms[i].title = ss[1];
				ms[i].genre = ss[2];
				ms[i].poster = ss[3];
				ms[i].actor = ss[4];
				ms[i].regdate = ss[5];
				ms[i].grade = ss[6];
				ms[i].directer = ss[7];
				i++; //다음 줄!
			}
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//2. 목록 출력
	void list() {
		for( Movie m : ms) {
			System.out.println(m.movie_no+"."+m.title);
		}
	}
	
	//3. 상세 보기
	void detail(int mno) {
		// 배열 => 인덱스 => 구분자는 필요 없다 => movie_no
		Movie m = ms[mno-1]; //Movie의 배열 ms의 mno-1번째 인덱스 객체
		System.out.println("===============영화 상세===============");
		System.out.println("영화명: "+ m.title);
		System.out.println("감독: "+ m.directer);
		System.out.println("출연: "+ m.actor);
		System.out.println("장르: "+ m.genre);
		System.out.println("등급: "+ m.grade);
		System.out.println("개봉일: "+ m.regdate);
		System.out.println("순위: "+ m.movie_no);
		System.out.println("====================================");
	}
	
	//4. 영화명 출력
	void movieNameFind(String title) {
		System.out.println("=========검색결과=========");
		for(Movie m : ms) {
			if(m.title.contains(title)) {
				System.out.println(m.title);
			}
		}
	}
	
	//5. 출연으로 찾기
	void movieActorFind(String actor) {
		for(Movie m : ms) {
			if(m.actor.contains(actor)) {
				System.out.println(m.title+
									"("+m.actor+")");
			}
		}
	}
	//6. 장르 찾기
	void movieGenreFind(String genre) {
		for(Movie m : ms) {
			if(m.genre.equals(genre)) {
				System.out.println(m.title+
						"("+m.genre+")");
			}
		}
	}
}
public class MovieMain {

	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
		ms.list();
		
		// 영화 상세 명령문
//		System.out.println("==================================");
		Scanner sc = new Scanner(System.in);
//		System.out.print("상세 볼 영화 선택 (1-1938): ");
//		ms.detail(sc.nextInt());
		
		// 영화명 출력
//		System.out.print("찾을 영화 입력: ");
//		ms.movieNameFind(sc.next());
		
		// 배우 입력
//		System.out.print("찾을 배우 입력: ");
//		ms.movieActorFind(sc.next());
		
		// 장르 입력
		System.out.print("찾을 장르 입력: ");
		ms.movieGenreFind(sc.next());

	}

}
