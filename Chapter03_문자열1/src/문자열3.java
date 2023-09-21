/*
 * 
 */
import java.util.*;
//문자열 입력을 받아서 a,A가 몇개인지 확인
public class 문자열3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String d = sc.next();
		
		int cnt = 0;
		for(int i = 0; i< d.length(); i++) {
			char c = d.charAt(i);
			if(c=='a'||c=='A')
				cnt++;
		}
		System.out.println("a,A의 갯수는 "+cnt);

	}

}
