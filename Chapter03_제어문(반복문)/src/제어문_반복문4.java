
//1-100 => 루프변수
//총합, 짝수합, 홀수합 => 누적변수
public class 제어문_반복문4 {

	public static void main(String[] args) {
		int sum = 0, even = 0, odd = 0;
		for(int i= 1; i<=100; i++) {
			sum+=i;
			//System.out.println("sum= "+sum+" i= "+i);
			if(i%2==0)
				even+=i; //짝합
			else
				odd+=i; //홀합
		}
		System.out.println("짝수합: "+even);
		System.out.println("홀수합: "+odd);
		System.out.println("총합: "+sum);

	}

}
