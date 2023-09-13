/* <<=, >>= 쉬프트 (비트이동 연산자)
 *  
 *  << : 비트를 왼족으로 이동
 *  >> : 비트를 오른쪽으로 이동
 *  

 */
public class 복합대입연산자_1 {
	public static void main(String[] args) {
		int a = 27;
		a <<= 3;// 11011000
		System.out.println(a);
		a = 27;
		a >>= 3; // 11 ==> 3
		System.out.println(a); 
		// a = 33 ==? 왼쪽으로 2 이동, 오른족으로 2 이동
	}
}
