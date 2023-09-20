/*
 * while
 * -------
 * 10개의 난수
 * 최댓값 / 최솟값
 * 
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		int max = 1, min = 100;
		int i =1; //루프변수 1~
		while(i<=10) {
			int rand = (int)(Math.random()*101);
			System.out.println(rand+" ");
			//최댓값, 최소값
			if(max<rand)
				max = rand;
			if(min>rand)
				min = rand;
			i++;
		}
		System.out.println("m = "+max);
		System.out.println("m = "+min);
	}

}
