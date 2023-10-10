import java.util.*;

public class MainClass2 {
	// 클래스 안의 모든 메소드에서 사용이 가능
	static int[] lastday = {
			31,28,31,30,31,30,
			31,31,30,31,30,31
	};
	static char[] strWeek = {'일','월','화','수','목','금','토'};
	static int y, m, w;
	
	// 년도, 월 입력
	static void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력");
		y = sc.nextInt();
		
		System.out.println("월 입력");
		m = sc.nextInt();
		
		System.out.println("일 입력");
		int d = sc.nextInt();
	}
	
	// 요일 구하기
	static void dayTotal() {
		int total = (y-1) * 365
				   +(y-1) / 4
				   -(y-1) / 100
				   +(y-1) /400;
		
		// 윤년일 결우 변경 (2월 날짜 변경)
		if((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) 
			 lastday[1] = 29;
		else
			lastday[1] = 28;
		 
		// 2. 전달까지 날수
		for(int k = 0; k < m -1 ; k++) {
			total += lastday[k];
		}
		// 3. 요청 날 ==============> 1+2+3%7 => (0-6)
		total ++;
		
		//요일 구하기
		w = total %7;
	}
	
	static void print() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
