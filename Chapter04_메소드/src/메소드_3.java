//숫자 야구 게임
import java.util.Arrays;
import java.util.Scanner;
/*
/* *** 어떤 값을 받아서 뭘 출력할 건지?
 * 
 * 1. 컴퓨터가 임의로 난수 발생 => com[]
 * 	  리턴 => int[] / 매개변수(X)
 * 
 * 2. 사용자가 입력 => user[]
 *    리턴 => int[] / 매개변수(X)
 *    
 * 3. 힌트 => com[], user[] => s, b 추출 후 출력
 *    리턴 => int s / 매개변수(com[], user[])
 *    ~> print() 메소드 생성 시 s,b가 있는 이 메소드에서 출력
 *    
 * 4. 종료여부 => s 필요하기 때문에 힌트 호출 후 s값 리턴 받아야 됨
 *    리턴 => boolean / 매개변수(int s) 
 *    
 * 5. 조립
 */

public class 메소드_3 {
	static int[] com = new int[3];
	static int[] user = new int[3];
	static int ip;
	static int s = 0, b = 0;
	
	public static void getRandom() {
		//컴퓨터가 임의로 난수 발생
		for(int i = 0; i<com.length; i++) {
			com[i] = (int)(Math.random()*9)+1;
						 //--------------- 0.0~81
			         //----- 0-8
										 //-- 1-9
	    for(int j = 0; j<i;j++) {
	    	if(com[i]==com[j]) {
	    		i--;
	    		break;
	    	}
	    }
		}
	}
	
	public static void userInput() {
		//System.out.println(Arrays.toString(com));
		//사용자 요청	
		Scanner sc = new Scanner(System.in);
		while(true) { //무한루프 => 종료여부
			System.out.println("세자리 정수 입력: ");
			ip = sc.nextInt();
			if(ip<100 || ip>999) {
				System.out.println("잘못된 입력이다");
				continue;
				// 처음부터 실행(while)
				// 제외 (for)
			}
			// 배열에 입력된 값 적용
			user[0] = ip/100;
			user[1] = (ip%100)/10;
			user[2] = ip%10;
			//중복 숫자 제거 오류 처리
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0]) {
				System.out.println("같은 수는 사용 불가");
				continue;
			}
			// 0 제거 오류 처리
			if(user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0 사용 불가");
				continue;
			}
			break; // 추가됨!!!! -> user 값 리턴을 위해서 빠져나가야 함
		}
		//return user;
	}
	
	public static int hint() {
		// 힌트 제공
		for(int i = 0; i<3; i++) { //com 
			for(int j = 0; j<3; j++) {//user
				if(com[i]==user[j]) { // 같은 수 있는지 확인
					if(i==j)
						s++; //같은 자리수
					else
						b++; //다른 자리수
				}
			}
		}
		//힌트 출력
		System.out.printf("입력값 : %d, rufrhk %dS-$dB\n",
				ip, s, b);
		return s;
	}
	//종료 여부 확인
	public static void isEnd() {
		boolean bc = false;
		if(s == 3) {
			bc = true;
			System.out.println("게임 오버");
		//break;
	}
	}
	public static void process() {
		getRandom();
		while(true) {
			userInput();
			s = hint();
			//if(isEnd())		
		}
		
		
	}
	

	public static void main(String[] args) {


		


	}

}
