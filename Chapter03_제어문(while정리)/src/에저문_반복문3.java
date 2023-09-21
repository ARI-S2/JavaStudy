//do while
//업 다운 게임 => 단점

import java.util.Scanner;

public class 에저문_반복문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*101);
		
		do {
			System.out.println("정수 입력(1-100): ");
			int u = sc.nextInt();
			
			if(com>u) {
				System.out.println("입력값보다 큰 수를 입력하세요");
			}else if(com<u) {
				System.out.println("입력값보다 작은 수를 입력하세요");
			}else {
				System.out.println("게임 끝");
				System.exit(0);
			}
			
	}while(true);

}
}
