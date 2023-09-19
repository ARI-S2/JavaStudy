
/*
 * 업다운 게임
 * ---------
 * 컴퓨터 난수 발생 1-100
 * -------------------
 * 정답이 나올때까지 반복
 * ----------------무한루프
 * for(;;)
 * while(true)
 */

import java.util.Scanner;

public class 제어문_반복문9 {

	public static void main(String[] args) {
		//종료 => break, System.exit(0)
		int com = (int)(Math.random()*101);
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1-100까지 입력: ");
			int user = sc.nextInt();
			cnt++;
			
			if(user<1||user>100) {
				System.out.println("잘못된 입력이다");
				continue; // break는 종료/ continue는 다시 돌아감
			}
			
			if(com>user) {
				System.out.println("높은 정수 입력(UP)");
			}else if (com<user) {
				System.out.println("낮은 정수 입력(DOWN)");
			}else {
				System.out.println("게임 종료!"+cnt);
				break;
			}
		}
		

	}

}
