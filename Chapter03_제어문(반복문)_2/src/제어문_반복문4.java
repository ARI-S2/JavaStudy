/*
 * *****
 * *****
 * *****
 * *****
 * 
 * ABCDE
 * FGHIK
 * K
 * ~~~ T
 * 
 * ★☆☆☆
 * ☆★☆☆
 * ☆☆★☆
 * ☆☆☆★
 */
public class 제어문_반복문4 {

	public static void main(String[] args) {
//		for(int i =1; i<=4; i++) { // 행
//			for(int j =1; j <=5; j++) // 열{
//				System.out.print("*");
//			}
//		System.out.println();
//		}
//	char a = 'A';
//	for(int i =1; i<=4; i++) { // 행
//		for(int j =1; j <=5; j++) {// 열
//			System.out.print(a++);
//		}
//	System.out.println();
//}
	
//	for(int i = 1; i<=4; i++) {
//		for(char c = 'A'; c<='E'; c++) {
//			System.out.print(c);
//		}
//		System.out.println();
//	}
		
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j<=4; j++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(' ');
			}
			System.out.println();
		}
}
}
	


