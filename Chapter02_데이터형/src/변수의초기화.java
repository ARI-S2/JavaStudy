/*
 *   변수에 초기화
 *   1) 변수 추출
 *   2) 변수 선언(데이터형)
 *   3) 변수 초기화
 *      = 명시적인 초기화 int a = 10;
 *      = 입력값을 받는 경우 Scanner / BufferedReader (예외처리 필요)
 *      = 임의값을 받아서 초기화 - 랜덤
 *      = 크롤링 
 */
import java.util.Scanner;
public class 변수의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 10;
		
		int b = (int)(Math.random()*100)+1; // random은 0.0 - 0.99
		System.out.println(b);
	    
		Scanner sc = new Scanner(System.in);
	    System.out.println("정수 입력: ");
	    int c = sc.nextInt();
	    System.out.println(c);*/
		int a = 10;
		int b = 20;
		
		//값을 바꿈 => 임시변수 선언
		int temp = a;
		a = b;
		b = temp;
	}

}
