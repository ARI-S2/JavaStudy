/*
 * // % => 배수 ==> 화폐매수 구하기
 * 
 * 문자열과 숫자를 + 연산 할 때 숫자에 괄호 싸기 ! ! !
 * ----   --              --------
 */
public class 산술연산자_1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a+"%"+b+"="+a%b);
		System.out.println(-a+"%"+b+"="+-a%b);
		System.out.println(a+"%"+-b+"="+a%-b);
		System.out.println(-a+"%"+-b+"="+-a%-b);
		
		System.out.println("============================");
		int c = 369;
		// 백단위 :3 , 십단위 : 6 , 단단위 : 0
		System.out.println(c / 100); // 몫
		System.out.println(c % 100 / 10); // 십단위만 남겨놓고 몫을 구함
		System.out.println(c % 10); // 나머지
				

    }
}
