// charAt
// 대문자 / 소문자 변경
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abcdef";
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			System.out.print((char)(c-32)); //대문자 - 32= 소문자
		}
		System.out.println();
		System.out.println(s.toUpperCase());
		String a ="ABCDEF";
		System.out.println(a.toLowerCase());
	}

}
