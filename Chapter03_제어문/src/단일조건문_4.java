
/*
 * 정수 두개를 난수로 받아서 최댓값 최솟값 출력
 */
public class 단일조건문_4 {
	public static void main(String[] args) {
		int a = ((int)Math.random()*100)+1;
		int b = ((int)Math.random()*100)+1;
		
		System.out.println("Max: "+Math.max(a, b));
		System.out.println("Min: "+Math.min(a, b));


	}

}
