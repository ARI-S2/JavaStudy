/*
 * break : 반복 중단 
 * 			게임 => esc (반복문, switch) => 반복문안에 if문 가능
 * continue : while(true)일떄 자주 씀
 * 
 * ------------------------ 반복문에서만 사용이 가능!!
 * for ()
 * {
 * 		for(){
 * 			 break; // 이 블록만 제어!!
 * 		}
 * }
 * 
 * outer: for () //이름 다 상관 없음
 * {
 * 		for(){
 * 			 break outer; // 이름 붙은 포문까지 끝남
 * 		}
 * }
 */
public class 제어문_반복제어문1 {

	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			if(i==3) {
				break;
			//System.out.println("i= "+i); 브레이크 다음은 명령문 불가
			}System.out.println("i= "+i); 
		}
		
		for(int i =1; i<=10; i++) {
			if(i==3) {
				continue; // 증가식으로 이동
		
			}System.out.println("i= "+i); 
		}

	}

}
