import java.util.Scanner;

class Student2 {
	String name = "";
	int kor;
	int eng;
	int math;
}

public class MainClass4 {

	public static void main(String[] args) {
		Student2[] std = new Student2[3]; // 객체 배열만 선언 ~> 메모리 할당 전 !!!!
		Scanner sc = new Scanner(System.in);
		
		for (int i =0; i<std.length; i++) {
			std[i] = new Student2(); // 객체 생성
			std[i].name = sc.next();
			
		}

	}

}
