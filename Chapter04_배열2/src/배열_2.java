/*
 * 정수를 1개 입력받아서 이진법 출력
 * 32bit => 0,1 => 16bit(0-32767)
 */
import java.util.Scanner;

public class 배열_2 {

	public static void main(String[] args) {
		int[] b = new int[16];
		int i = b.length-1; //역순으로 값 배치 (이진법은 뒤에서부터 값 입력)

		Scanner sc = new Scanner(System.in);
		System.out.println("0-32767사이의 수 입력");
		int n = sc.nextInt();
		
		while(true) {
			b[i] = n%2;
			n = n/2;
			if(n==0) break;
			i--;
		}
		for(int k=0; k < b.length; k++) {
			if(k%4==0 && k!=0) {
				System.out.print(" ");
			}
			System.out.print(b[k]);
		}
	}

}
