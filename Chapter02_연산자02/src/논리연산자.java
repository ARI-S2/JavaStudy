/*
 * && 직렬연산자 / and / 기간, 범위 안에 포함
 * || 병열연산자 / or / 기간, 범위가 아닐때
 * -----
 * => 조건에 사용할 수 있는 연산자 (부정연산자, 비교연산자)
 * (조건) && (조건)      (조건) || (조건) 
 * ----     ----       ----     ----
 *  ㅣ        ㅣ         ㅣ        ㅣ
 *  ----------          ----------
 *     결과값                결과값
 * 
 * &&, ||는 효율적인 연산을 수행 (뒤에꺼는 확인할 필요도 없디)
 * -----------------------
 * && => false면 뒤에 있는 조건은 수행하지 않는다
 * || => true면 뒤에 있는 조건은 수행하지 않는다
 * 
 */
public class 논리연산자 {
	public static void main(String[] args) {
		/*int a =10;
		int b = 9;
		
		boolean bCheck = a<b && ++b==a;
		System.out.println(bCheck); //false 기에 &&연산 뒤의 식은 수행되지 않음 ! !
		System.out.println(b); // b = 9
		bCheck = a<b || ++b==a; //앞에가 false기에 뒤에가 true인지 확인하러 수행함 ! !
		System.out.println(b); //b = 10
		*/
		
		int a = 10;
		int b = 21;
		
		boolean bCheck = (a%2==0) && (b%2!=0);
		bCheck = (a%2==0) || (b%2!=0);
	}

}
