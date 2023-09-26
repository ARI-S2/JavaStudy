/*
 * split => string[]
 */

import javax.lang.model.element.NestingKind;

public class 문자열_5 {

	public static void main(String[] args) {
//		String ac = "하정우,임시완,배성우,김상호";
//		String[] m = ac.split(","); // ,로 구분해 들어옴 => 배열로 저장 (앞에서부너 0번)
//		for(String a : m) {
//			System.out.println(a);
//		}
		
//		String ac = "하정우|임시완|배성우|김상호"; // |로 구분자로 쓸 떄는 .split("//|") ==> //| 필요!
//		String[] m = ac.split("|");
//		for(String a : m) {
//		System.out.println(a);
//	}
		
		String n = " hello java ";
		System.out.println(n.trim()); // => 양 옆 공백이 사라져서 길이가 줄어듬
		
		String s = " hello java ";
		// replace() => 원하는 문자를 변경
		System.out.println(s = s.replace("a", "aaa")); // 출력문 안에서도 값 대입 가능
		System.out.println(s.replace("jaaavaaa", "python"));
		System.out.println(s);
	
		String msg = "예를 들어 최대수가 5이면 5보다 작거나 같은 숫자를 이용해서 기약분수를 만들어야합니다.";
		if(msg.length()>20) { //문자열일 땐 .length() 메소드 | 배열일 떈 .length => 메소드 아니고 속성임 
			msg = msg.substring(0,20) + "...";
			//msg = msg.substring(0,20).concat("..."); => 보다 + 연산을 더 많이 씀
		}
		System.out.println(msg);
	}

}
