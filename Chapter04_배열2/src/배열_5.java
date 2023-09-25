// 간단한 중복 없는 난수
public class 배열_5 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0 ; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
			for(int j = 0; j<i; j++) {
				if (arr[i] == arr[j]) {
					i--; // 같으면 인덱스 -1해서 다시
					break;
				}
			}
		}
		
		for(int a : arr) {
			System.out.print(a+" ");
		}

	}

}
