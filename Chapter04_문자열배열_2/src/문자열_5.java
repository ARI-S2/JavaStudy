import java.util.*;
import java.io.*;


public class 문자열_5 {
	static String seoulD;
	static { // 자동 실행
		try {
			FileReader fr = new FileReader("C:\\javaDev\\seoul_location.txt");
			int i = 0;
			while(((i=fr.read())!=-1)) {
				seoulD += (char)i; // 양이 많지 않아서 append 안써도 됨
			}
			fr.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		System.out.println(seoulD);
		//1. 페이징 기법 => 10페이지 출력
		String[] seoul = seoulD.split("\n");
		Scanner sc = new Scanner(System.in);
		int curp = 1;
		int totalp = (int)(Math.ceil(seoul.length/10.0)); // 총 페이지 구할 떄 형식!!
		
		//System.out.println("총페이지: "+totalp);
		while(true) {
		System.out.print("페이지 선택(1~"+totalp+"):");
		curp = sc.nextInt();
		if(curp<1 || curp>28) {
			System.out.println("프로그램 종료!");
			break;
		}
		
		final int ROW = 10;
		int j = 0; // 10개씩 나눠주는 변수
		int pagecnt = (curp*ROW)-ROW; // for문의 시작위치 (출력)
		/*
		 * 1page 0-9
		 * 2page 10-19
		 * 3page 20-29
		 */
		for(int i = 0; i< seoul.length;i++) {
			String[] ss = seoul[i].split("\\|");
			if(j<ROW && i>=pagecnt) { //for문 개수가 시작하는 위치라 i 부터 10개식 나눠서 출력
				System.out.println(ss[0]+"."+ss[1]);
				j++;
			}
		}
		}
	}

}
