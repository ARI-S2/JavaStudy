/*
 * && , || =? 범위가 있는 경우
 * 포함  미포함
 * 
 * 1-12 입력
 * 12,1,2 => 겨울 (범위가 연속적이지 않으면 || 오어 연산)
 * 3,4,5=> 봄 (범위가 연속적이면 && 앤드연산)
 * 6,7,8 => 여름
 * 9,10,11 => 가을
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class 논리연산자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1-12월까지 입력");
		int m = sc.nextInt();
		System.out.print(m+"월은 ");
		System.out.print(m>=3 && m <=5?"봄이다":"");
		System.out.print(m>=6 && m <=8?"봄이다":"");
		System.out.print(m>=9 && m <=11?"봄이다":"");
		System.out.print(m == 12 || m==1 || m ==2? "겨울이다":"");

		
	}

}
