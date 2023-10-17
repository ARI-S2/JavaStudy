/*
 * substring() => 문자열 자르기
 * 1) 문자열.substring( a ) : a부터 끝까지
 * 2) 문자열.substring(a , b) : a부터 b-1까지
 */
public class 문자열_4 {

	public static void main(String[] args) {
		String s = "서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
//		String s1 = s.substring(0,20);
		
//		String addr = s.substring(0, s.indexOf("지번"));
		String addr = s.substring(s.indexOf("지번")+3); // 글자 갯수 +연산 가능
		String addr2 = s.substring(s.indexOf("서울시"));
		String addr3 = s.substring(s.indexOf("신"),s.indexOf("신")+3);
		
//		int a = addr.lastIndexOf(" ");
//		String addr4 = addr.substring(a-3,a);
		
		String ext = "Hello java.java";
		String b = ext.substring(ext.lastIndexOf(".")); // 매개변수 1개 있을 때는 포함됨 <=> 2개일때는 마지막 변수 -1
		
		System.out.println(addr);
		System.out.println(addr2);
		System.out.println(addr3);

	}

}
