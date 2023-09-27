import java.util.*;
import java.io.*;
/*
 * 라이브러리
 * -------
 *   java.lang. : Obhect, String, StringBuffer, Math, Wrapper
 *   java.util : List, Set, Map
 *   java.io :
 *   java.net
 *   java.text
 */
public class 문자열_4 {
	static String movie; // 전역 스트링 변수 선언
	static {
		try {
			// 파일 읽기
			FileReader fr = new FileReader("C:\\javaDev\\movie.txt");
			int i = 0;
			//String data ="";
			StringBuffer data = new StringBuffer(); // 스트링 버퍼 객체 생성
			
			while((i=fr.read())!=-1) { // -1 == EOF
				data.append((char)i); // 객체에 한글자씩 char로 바꿔서 추가
			}
			System.out.println(data.toString()); // 스트링으로 바꿔서 출력
			movie = data.toString();
		}catch(Exception ex) {}
	}
	
	public static void main(String[] args) throws Exception {
		// System.out.println(movie); 전역 변수 메인 안에서 호출 가능
		String[] md = movie.split("\n");
//		System.out.println("영화갯수 : "+md.length);
		//System.out.println(md[0]);
		
		//검색 
		//송강호가 출연한 영화를 툴력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String n = sc.next();
		
		//송강호가 출연한 개봉한 영화
		for(String m : md) {
			String[] dt = movie.split("\\|");
			if(dt[4].contains(n)) {
				System.out.println("순위: "+dt[0]);
				System.out.println("영화명: "+dt[1]);
				System.out.println("장르: "+dt[2]);
				System.out.println("출연: "+dt[4]);
				System.out.println("개봉일: "+dt[5]);
				System.out.println("등급: "+dt[6]);
				System.out.println("강독: "+dt[7]);
				System.out.println("=====================================================");
			}
			
			//1990년에 개본한 영화
			System.out.println("년도 입력");
			int a = sc.nextInt();
			for(String m1 : md) {
				String[] dt1 = movie.split("\\|");
				if(dt1[5].equals(a)) {
					System.out.println("순위: "+dt[0]);
					System.out.println("영화명: "+dt[1]);
					System.out.println("장르: "+dt[2]);
					System.out.println("출연: "+dt[4]);
					System.out.println("개봉일: "+dt[5]);
					System.out.println("등급: "+dt[6]);
					System.out.println("강독: "+dt[7]);
					System.out.println("=====================================================");
				}
				
//				//12세 이상 개봉
//				int grade = sc.nextInt();
//				for(String a : md) {
//					String[] dt2 = movie.split("\\|");
//					if(dt[6].startsWith(String.valueOf(grade))) {
//						System.out.println("순위: "+dt[0]);
//						System.out.println("영화명: "+dt[1]);
//						System.out.println("장르: "+dt[2]);
//						System.out.println("출연: "+dt[4]);
//						System.out.println("개봉일: "+dt[5]);
//						System.out.println("등급: "+dt[6]);
//						System.out.println("강독: "+dt[7]);
//						System.out.println("=====================================================");
//					}	
			
			
		}
	}
}
}
