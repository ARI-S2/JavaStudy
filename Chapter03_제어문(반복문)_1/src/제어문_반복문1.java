/*
n = int(input())
m = []
for _ in range(n):
    m.append(int(input()))
m.sort()
for i in range(n):
    print(m[i])

시간초과ㅣㅣㅣ
 *    
 */
/*
 * 1. 반복문=> 중복 제거
 *           ------- 메소드
 *    1. 데이터 저장
 *    	 같은 데어터형 묶음 : 배열
 *    	 다른 데이터형 묶음 ㅣ 클래스(의 생성자)
 *    2. 명령문
 *    	 명령문 묶음 ㅣ 메소드
 * 2. 반복문의 종류:
 * 1. for : 횟수가 지정된 경우에 주로 사용
 * 			=> 화면 출력(목록)
 * 	  		일반 /향상 for문 for( : )
 * 
 * for (int k = 1; k <=100; k+=2)// 2식만 증가해도 홀수!!! 
 * 
 * main 밖에 선언 변수 타 클래스에서 사용 가능 => 전역변수
 * 클래스명.변수명
 *    
 */
import java.io.*;
public class 제어문_반복문1 {

	public static void main(String[] args) throws Exception{
//		String s= "ABCDEFGHIJKLNMOP";
//		String[] a = s.split("");
//		for (int i =0; i<a.length; i++) {
//			System.out.print(a[i]);
//		}
//		System.out.println();
//		for(String ss : a) {
//			System.out.print(ss);
//		}
		FileReader fr = new FileReader("C:\\javaDev\\javaStudy\\Chapter02_제어문(반복문)_1\\src\\제어문_반복문1.java");
		int i =0;
		while((i=fr.read())!=-1)  //EOF 
			System.out.print((char)i); //정수로 한글자씩 읽어서 CHAR 변환
		
		
		for(int j = 11; j<=99; j++) {
			if(j%11==0) {
				System.out.println(i);
			}
		}
		
	}
	}

			
	
	

			

	
	



