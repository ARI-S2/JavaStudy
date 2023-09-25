/*
 * 알파벳 ==> 문자열은 안됨
 * 			---------- 비교연산자 사용 불가
 * 			compare() 음수 / 양수 / 0
 * 			String s = "H";
 * 			String s1 = "K";
 *          s.compare(s1);
 *          --         --
 *           H			K = -2 
 */

import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		char[] a = new char[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = (char)((Math.random()*26)+65);
		}
		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i<a.length-1; i++) { // j가 더 클때 오름차순
			for(int j = i+1; j<a.length; j++) {
				if(a[i] < a[j]) {
					char temp = a[i]; 
					a[i] = a[j];
					a[j] = temp;
					
				}
				System.out.println("라운드"+a[i]);
				System.out.println(Arrays.toString(a));
			}System.out.println(Arrays.toString(a));
	}

	}

}
