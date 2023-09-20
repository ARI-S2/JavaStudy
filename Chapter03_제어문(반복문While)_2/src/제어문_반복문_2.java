/*
 * 변수의 기능(읽기:값 가져오기) / 쓰기: 메모리에 저장, 수정)
 * 변수를 저장하기 위해서는 메모리 크기를 결정
 * 
 * long 형 변수 = 100L
 * 
 * 프로그램 흐름제어
 * => 오류 발생시 건너뛰기 :break continue
 * => 반복수행: for while
 * => 원하는 프로그램 수행: if
 * 
 */

//가위바위보 => 10번 => 3승 2무 5패

import java.util.Scanner;
class A {
	
}
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		int win=0,lose=0,draw=0;
		Scanner sc = new Scanner(System.in);
		
		int i=1;
		while(i <=10) {
			//A a = new A();
			//System.out.println(a);
			System.out.println(i+"번째 게임");
			int com = (int)(Math.random()*3);
			System.out.println("가위0/ 바위1/ 보2");
			System.out.print("컴퓨터: ");
			if(com==0) 
				System.out.print("가위");
			else if(com==1) 
				System.out.print("바위");
			else if(com==2) 
				System.out.print("보");
			
			int user = 0;
			while(true) {
				System.out.println();
				System.out.println("가위0/ 바위1/ 보2");
				user = sc.nextInt();
				if(user<0||user>2) {
					System.out.println("0/1/2 중에 입력");
					continue;
				}
				break;// 맞으면 빠져나감
			}
			
			if(user==0) 
				System.out.println("가위");
			else if(user==1) 
				System.out.println("바위");
			else if(user==2) 
				System.out.println("보");
			
			int res = com - user;
			if(res==-1||res==2) {
				System.out.println("사용자 win");
				win++;
			}
			else if(res==1||res==-2) {
				System.out.println("컴퓨터 win");
				lose++;
			}
			else {
				System.out.println("비겼다");
				draw++;
			}
			
			System.out.printf("%d승 %d무 %d패\n",win,lose,draw);
			i++;
		}
	}

}
