/*
 * System.exit(0) => 시스템 전체 종료
 * break => 그 블록만 종료
 */
public class 제어문_반복제어문2 {

	public static void main(String[] args) {
		// 총 for문 반복횟수: i * j 
		for(int i =1; i<=3; i++) {
			for(int j =1; j<=3; j++) {
				if (j ==2)
					break; // 이 if문 블록만 제어
				System.out.println("i= "+i+"j= "+j); //i는 킵고잉, j는 2를 넘어가지 못함
			}
		}
		
		System.out.println();
		for(int i =1; i<=3; i++) {
			for(int j =1; j<=3; j++) {
				if (j ==2)
					 continue; // 이 if문 블록만 제어
				System.out.println("i= "+i+"j= "+j); //i는 킵고잉, j는 2만 넘어감
			}
		}
		
		System.out.println();
		out: for(int i =1; i<=3; i++) {
			for(int j =1; j<=3; j++) {
				if (j ==2)
					 break out; // out이름의 for문까지 제어
				System.out.println("i= "+i+"j= "+j); //j=1까지만 수행
			}
		}

	}
}
