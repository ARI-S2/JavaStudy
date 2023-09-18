import java.util.Scanner;
/*

 */

public class 제어문_문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("첫번재 정수 입력: ");
		int a = sc.nextInt();
		System.out.println("두번재 정수 입력: ");
		int b = sc.nextInt();
		System.out.println("연산자 입력: ");

		char op = sc.next().charAt(0);
		switch(op){
			case '+':
				System.out.printf("%d+%d = %d",a,b,(a+b));
				break;
			case '-':
				System.out.printf("%d-%d = %d",a,b,(a-b));
				break;

			case '*':
				System.out.printf("%d*%d = %d",a,b,(a*b));
				break;
			case '/':
				System.out.printf("%d/d = %d",a,b,(a/b));
				break;

		}
	}

}
