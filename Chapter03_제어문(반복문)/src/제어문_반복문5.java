
//1-100까지 3의배수, 5의배수, 7의배수 합을 누적해서 출력
public class 제어문_반복문5 {

	public static void main(String[] args) {
		int sum3 = 0, sum5 = 0, sum7 = 0;
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				sum3 += i;
			}
			if(i%5==0) {
				sum5 += i;
			}
			if(i%7==0) {
				sum7 += i;
			}
		}
		System.out.println("3배수: "+sum3+" 5배수합: "+sum5+" 7배수합: "+sum7);
		System.out.println("총합: "+(sum3+sum5+sum7));

	}

}
