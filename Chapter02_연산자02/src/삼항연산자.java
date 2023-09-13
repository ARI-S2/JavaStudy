/*
 * (조건) ? 값1 : 값2
 * -----
 * true : 값1
 * false : 값2
 *  
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1;
		System.out.println(a);
		System.out.println(a%2 == 0? "짝수" :"홀수");
		
		int sex = (int)(Math.random()*4)+1;
		System.out.println(sex);
		System.out.println(sex % 2 == 0 ? "여자" :"남자");
	
	}

}
