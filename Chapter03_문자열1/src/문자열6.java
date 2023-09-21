import java.util.Scanner;

public class 문자열6 {

	public static void main(String[] args) {
		String[] d = {
				"Java와 JSP",
				"자바와 오라클",
				"오라클 프로그래밍",
				"제이쿼리와 에이잭스",
				"스프링과 자바"
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("검색어 입력: ");
		String fd = sc.nextLine(); // next()는 공백까지 받음
		System.out.println(fd);
		for(int i =0; i<d.length;i++) {
			if(d[i].contains(fd)) { //endsWith() , startsWith()
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {}
				
				System.out.println(d[i]);
			}

	}

}}
