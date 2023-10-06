
public class 메소드_매개변수전송법_2 {
	static void swap(int b) {
		b = 100;
	}
	static void swap2(int[] arr) {
		arr[0] = 100;
	}
	public static void main(String[] args) {
		int b = 10;
		swap(b); // 매개변수를 넘길 떄 값만 넘김 (배열 아니기에)
		System.out.println("b="+b);
		
		int[] arr = {1,2,3};
		swap2(arr); // 배열명을 넘겼기에 주소 값을 넘김 => 원본도 같이 바뀜
		System.out.println("arr="+arr);
	}

}
