

import java.util.Scanner;
public class 제어문_문제 {

	public static void main(String[] args) {
		//15번
		for(int i =1; i <=5; i++) {
			for(int j =1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		//18번
		for(int K ='A'; K <='E'; K++) {
			for(int m =1; m<=5; m++) {
				System.out.print((char)K);
			}
			System.out.println();
		}
		System.out.println();
		
		//17번
		for(int K = 1; K <= 5; K++) {
			for(int m ='A'; m<='E'; m++) {
				System.out.print((char)m);
			}
			System.out.println();
		}
		System.out.println();
		
		//16번
		for(int i =1; i <=5; i++) {
			for(int j =1; j<=5; j++) {
				if(i==j)
				System.out.print(i);
				else
					System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		//12번
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int a3=0,a5=0;
		for(int i =1; i <=10; i++) {
			System.out.println("정수 입력: ");
			a = sc.nextInt();
			if(a%3==0) {
				a3++;
			}
			if(a%5==0) {
				a5++;
			}
		}System.out.println("3의 배수: "+a3);
		System.out.println("5의 배수: "+a5);
		
	}

}
