// for문은 수열(숫자마다 패턴)이 있어야 가능 => 2468...
//20개의 정수 난수 발생 => 짝수, 홀수
public class 제어문_반복문11 {

	public static void main(String[] args) {
//		int even = 0,odd = 0;
//		for(int i =0;i<20;i++) {
//			int ran = (int)(Math.random()*11);
//			if(ran%2==0) {
//				even++;
//			}
//			else
//				odd++;
//		}
//		System.out.println("짝수 갯수: "+even);
//		System.out.println("홀수 갯수: "+odd);
//
//		int cnt1=0,cnt2=0,cnt3=0;
//		
//		for(int j=0; j <=10; j++ ) {
//			int ran = (int)(Math.random()*11);
//			if(ran%3==0) {
//				cnt1++;
//			}
//			if (ran%5==0) {
//				cnt2++;
//			}
//			else if(ran %7 ==0) {
//				cnt3++;
//			}
//		}
//		int sum = 0;
//		for(int i =1; i<=10; i++) {
//			if(i%2==0) {
//				sum+=i;
//			}else
//				sum-=i;
//		}
		for(char a = 'B'; a<='N'; a+=2) {
			System.out.println(a);
		}
	}

}
