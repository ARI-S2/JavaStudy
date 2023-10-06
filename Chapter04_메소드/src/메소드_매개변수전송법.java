/*
 * 배열 이름(주소값) 넘김 => 주소값을 복사(얕은 복시
 */
public class 메소드_매개변수전송법 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] temp = arr; // 배열 이름(주소값) 넘김
		// 주소값을 복사(얕은 복시) => arr 값이 바뀌면 같이 바뀜
		System.out.println("arr="+arr);
		System.out.println("temp="+temp);
		
		System.out.println("temp[0]="+temp[0]);
		System.out.println("arr[0]="+arr[0]); //AS
		
		temp[0] = 1000;
		System.out.println("arr[0]="+arr[0]);
	}

}
