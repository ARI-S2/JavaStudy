
public class 메소드_매개변수전송법_3 {
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("변경 후 => swap: a="+a+" b ="+b);
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swap(a,b);
		System.out.println("변경 전 => main: a ="+a+" b ="+b);

	}

}
