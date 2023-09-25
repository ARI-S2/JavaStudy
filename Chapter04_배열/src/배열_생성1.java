/*
 * 
 */
//문자 => 10갸를 저장하는 배열 생성 => 최기화 => 출력
//         --------
//실수 배열 ==> double[] arr = {10,20,30}
//char[] arr = new char[10] => '\0'
import java.util.Arrays;
import java.util.Iterator;
import java.sql.Array;

public class 배열_생성1 {

	public static void main(String[] args) {
		char[] a = new char[10]; //[0] - [9]
		// 출력용 => 웹 출력
		for(int i = 0; i < a.length; i++) {
			a[i] = (char)((Math.random()*26)+65);
		}
		
		for(char c: a) { //배열과 컬렉션
			System.out.print(c+" ");
		}
		
		System.out.println("\n=========API 정렬============");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println("=====내림차순=====");
		// 내림차순
		for(int i = a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		
		
		int[] arr = {50,75,85,95,100};
		int temp = 0;
		for(int i =0; i< arr.length; i++) {
			for(int j = i; j <arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			}
		}
			for (int n : arr) {
				System.out.print(n);
			}
		}
		
	}

}
