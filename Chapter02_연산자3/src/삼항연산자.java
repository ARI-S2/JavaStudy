/*

 */

import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {
//		int a = (int)(Math.random()*100)+1;
//			System.out.println(a%2==0 ? a+"는 짝수다" : a+"은 홀수다");
//		char c =(char)((Math.random()*26)+65); //A-Z (대문자)
//		char ch = 'a';
//		int s = (int)((Math.random()*2));//0,1
//		ch = s == 0 ? c : (char)(c+32); //'A'+32 = 'a' (0이면 대문자/ 1이면 소문자)
//		System.out.println(ch >= 'A' && ch <= 'Z' ? ch + "대문자입니다" : ch + "소문자입니다");
//		
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	n = (n / 5) + (n % 5);
//	System.out.println(n);
	

	    char ch = 'Z'; 
	    char lowerCase = (ch>='A' && ch <= 'z' ? (char)(ch + 32):(char)(ch - 32)); 
	    System.out.println("ch : " + ch); 
	    System.out.println("ch to lowerCase : " + lowerCase);
		
//		Scanner sc = new Scanner(System.in);
//		char ch = sc.next().charAt(0);
//		System.err.println(ch);
	    


		

	}

}
