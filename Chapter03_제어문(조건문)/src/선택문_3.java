/*
 * 12,1,2 겨울
 * 3,4,5 봄
 * 6,7,8 여름
 * 9,10,11 가을
 * 
 *case값이 동일할 수 없다
 *case값은 실수값은 올 수 없다
 *종료 시 break 필수
 *case순서 상관 없다
 */
public class 선택문_3 {

	public static void main(String[] args) {
		// 정수 임의 추출 random()
		int m = (int)(Math.random()*12)+1;
		System.out.println("입력된 달: " + m);
		switch(m) {
		case 12: case 1: case 2: 
			System.out.println("겨울");
			break;
		case 3: case 4: case 5: 
			System.out.println("봄");
			break;
		case 6: case 7: case 8: 
			System.out.println("여름");
			break;
		case 9: case 10: case 11: 
			System.out.println("가을");
			break;
		}

	}

}
