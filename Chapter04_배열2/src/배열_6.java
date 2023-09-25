/*
 * 1-100 => 10개 저장
 * 
 * 1, 총합
 * 2. 평균
 * 3. 최대값
 * 4. 최소값
 * 5. 최대값의 위치
 * 6. 최소값의 위치 => index
 */

import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("===========저장된 값==========");
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println("총합: "+sum);
		System.out.printf("평균: %.2f\n",sum/10.0);
		
		int max = 0, min = 100; // 더 큰 값으로 , 더 작은 값으로
		for(int i : arr) {
			if(max<i)
				max = i;
			if(min>i)
				min = i;
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);

		for(int i =0; i<arr.length; i++) { // 여러개 중복된 최소, 최대값 중복 출력 가능
			if(max == arr[i])
				System.out.println("최대값의 위치: "+ (i+1));
			if(min == arr[i])
			System.out.println("최소값의 위치: "+ (i+1));
		}

	}
}
