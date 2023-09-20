/*
 * *
 * **
 * ***
 * ****
 * 
 * ****
 * ***
 * **
 * *
 * 
 * i	j
 * 1	4 역순 => 더한다 // 선형 => i = j 까지
 * 2	3
 * 3	2
 * 4	1
 * -------------- i+j =5 => j = 5-i
 * 
 */
public class 제어문_반복문5 {

	public static void main(String[] args) {
//		for(int i =1; i<=4; i++) { // 행
//			for(int j =1; j <= i; j++) { // 열
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i =1; i<=4; i++) { // 행
			for(int j =4; j >= i; j--) { // 열
				System.out.print("*");
			}
			System.out.println();
		}
		
		char a ='A';
		for(int i =1; i<=4; i++) { // 행
			for(int j = 1; j <= i; j++) { // 열
				System.out.print(a++);
			}
			System.out.println();
		}
		


	}
}


