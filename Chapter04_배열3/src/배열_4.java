/*
 *  String[] s = new String[10];
 *  
 *  빈도수 구하기 => 100개의 난수 (0-9)
 *  순서 (최적화)
 */

import java.util.Arrays;

public class 배열_4 {
	public static void main(String[] args) {
		int[] data = new int[100];
		for(int i = 0; i<data.length; i++) {
			data[i] = (int)(Math.random()*10);			
		}
		System.out.println(Arrays.toString(data));
		//빈도 수 구하기
		int[] cnt = new int[10];
		for(int i = 0; i<data.length; i++) {
			cnt[data[i]]++; // data[1-100]가 가진 0-9까지의 값을 cnt[0-9] 인덱스에 나올때마다 +1
		}
		
		for(int i = 0; i<cnt.length; i++) {
			System.out.println(i+":"+cnt[i]);
		}// 총합
		int sum = 0;
		for(int i: cnt){
			sum+=i;
		}
		System.out.println("sum: "+sum);
}
}
