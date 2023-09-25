import java.util.Arrays;
import java.util.Scanner;

public class 배열_11 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;			
		}
		System.out.println(Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.println("=====메뉴=====");
			System.out.println("1. 최대값, 최소값 출력");
			System.out.println("2. 총합: ");
			System.out.println("3. 평균: ");
			System.out.println("4. 종료: ");
			System.out.println("==============: ");
			System.out.println("메뉴 선택: ");
			int m = sc.nextInt();
			
			if(m==4) 
				break;
			else if (m==1){
				
			}
			else if (m==2) {
				sum=0;
				for(int i : arr)
					sum+=i;
			}
			else if (m==3) {
				System.out.printf("평군%.2f\n", sum/10.0);
			}
		}

	}

}
