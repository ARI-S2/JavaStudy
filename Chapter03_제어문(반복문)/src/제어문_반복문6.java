
//1-100까지 5의배수 합과 갯수
public class 제어문_반복문6 {

	public static void main(String[] args) {
		int sum=0, s=0;
		for(int i = 0; i<=100; i++) {
			if (i%5 == 0) {
				sum+=i;
				s++;
			}
		}
		System.out.println("5배수합: "+sum+" 5배수 갯수: "+s);

	}

}
