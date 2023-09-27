import java.util.Scanner;

public class 문자열_1 {

	public static void main(String[] args) {
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		double[] avg = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<=3; i++) {
			System.out.println(i+1+"번째 학생 국어 점수 입력: ");
			kor[i] = sc.nextInt();
			System.out.println(i+1+"번째 학생 영어 점수 입력: ");
			eng[i] = sc.nextInt();
			System.out.println(i+1+"번째 학생 수학 점수 입력: ");
			math[i] = sc.nextInt();
			
			System.out.printf("%d번째 학생 평균: %.2f",i,kor[i]+eng[i]+math[i]/3.0);
			System.out.println();
			System.out.println("=======================");
		}

	}

}
