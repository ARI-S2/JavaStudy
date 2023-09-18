/*
 * 정수 1개 입력
 * 1=> 메모장
 * 2=> 그림판
 * 3=> 브라우저
 * -----------> 메뉴 클릭 / 버튼 클릭시 처리
 */

import java.io.IOException;
import java.util.Scanner;

public class 제어문_조건문3_3 {

	public static void main(String[] args) throws Exception  {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if (no == 1) {
			System.out.println("메모장 선택");
		} else if (no == 2) {
			System.out.println("그림판 선택");
		}
		else if (no == 3){
			System.out.println("크롬 선택");
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); // 역슬러시 2개씩!!
		}
	}

}
