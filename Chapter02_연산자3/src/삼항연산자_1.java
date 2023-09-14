/*
 * 컴퓨터와 가위바위보
 * 0 => 가위
 * 1 => 보
 * 2 => 바위
 * 
 * 1. 컴퓨터 난수 발생
 * 2. 사용자 입력
 * 3. 컴퓨터, 사용자의 가위바위보 출력
 * 
 * 소수찾기 => 나눠서 나머지가 0인 수가 1과 자신 뿐인 수
 * 리스트의 각 요소를 돌아가면서 나눴을 떄 0인거를 다 카운트 함
n = int(input())
m =list(map(int, input().split()))

s = []
for i in range(n):
for j in range(1,m[i]):
if m[i] % j == 0:
s.append(j)
  if len(s) == 2:
  print(m[i])

print(s.count(2))
s 111

 */

import java.util.Scanner;

public class 삼항연산자_1 {

	public static void main(String[] args) {
		int com = (int)(Math.random()*3);
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2): ");
		int user = sc.nextInt();
		//확인
		System.out.println("컴퓨터: ");
		System.out.print(com==0? "가위" : "");
		System.out.print(com==1? "바위" : "");
		System.out.print(com==2? "보" : "");
		System.out.println();
		System.out.print("플레이어: ");
		System.out.print(user==0? "가위" : "");
		System.out.print(user==1? "바위" : "");
		System.out.print(user==2? "보" : "");
		System.out.println();
		System.out.println("===========================");
		System.out.println(com-user == -1 || com-user == 2 ? "사용자 WIN" : "");
		System.out.println(com-user == -2 || com-user == 1 ? "컴퓨터 WIN" : "");
		System.out.println(com-user == 0 ? "비켰다" : "");

	}

}
