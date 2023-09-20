/*
 * for(){
 * 		while(){
 * 			if(){
 * 				for(){
 * 
 */
//1-100중에 짝수 합, 홀수 합
public class 제어문_반복문_1 {

	public static void main(String[] args) {
		int even =0, odd =0;
		int i =1;
		while(i<=100) {
			if(i%2==0) {
				even+=i;
			}else
				odd+=i;
			i++;
		}
		System.out.println("even= "+even);
		System.out.println("odd= "+odd);

	}

}
