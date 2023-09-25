/*
 * 가위바위보
 */

import java.util.Scanner;

public class 배열_생성_2 {

	public static void main(String[] args) {
		int com = (int)(Math.random()*3);
		Scanner sc = new Scanner(System.in);
		System.out.println("가위0 바위1 보2");
		int user = sc.nextInt();
		String[] res = {"가위","바위","보"};
		System.out.println("컴퓨터: "+ res[com]);
		System.out.println("사용자: "+ res[user]);
		
	}

}
