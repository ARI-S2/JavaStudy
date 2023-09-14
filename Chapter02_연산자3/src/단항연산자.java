/*
 * 증감연산자, 부정연산자, 형변환연산자
 * 
 */

import java.util.Scanner; 

 // 한개의 정수를 입력받아서 한개가 증가한 값을 출력하세오
public class 단항연산자 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		a = sc.nextInt();
		
/*		System.out.println(++a); //값 변동 됨
		System.out.println(a++);  //값 변동 안됨
		
		System.out.println(a += 10); //여기서 위에 ++된거 나타나고 +10돼서 22 출력

		int b = ++a; //전위니까 값 같음
		System.out.println("a=" + a);
		System.out.println("b=" + b);
*/
		boolean bCheck = true;
		System.out.println(bCheck);
		bCheck =! bCheck;
		System.out.println(bCheck);
		
		// 3명이서 하면 3을 나누고 나머지 값
//		boolean aa = true;
//		while(true) {
//			aa = ! aa;
//			if(aa==true) {
//				System.out.println("컴퓨터");
//			}
//			else{
//				System.err.println("사용자");
//			}	
//		}
		
	}

}
