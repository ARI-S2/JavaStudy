/*
 * 중복 없는 난수
 * => 예약일, 예약시간
 */
public class 배열_4 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		int s = 0;
		boolean bCheck = false;
		
		for(int i= 0; i<arr.length; i++) {
			bCheck = true;
			// 난수 발생
			// bCheck가 false면 배열에 저장하고 break
			while(bCheck) {
				s = (int)(Math.random()*10)+1;
				bCheck = false; //종료 조건을 만들어 둠
				// 배열에 저장된 값과 같은지 확인
				for(int j = 0; j<i; j++) {
					if(arr[j] == s) {
						bCheck = true;
						break;
					}
				}
			}
			  arr[i] = s;
		}
		for(int i1 : arr) {
			System.out.print(i1 + " ");
		}
	}

}
