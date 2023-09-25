import java.util.*;
/*
 * 숫자야구게임
 * --------
 * 1. 난수 (3자리)
 *        ------ 중복이 없는 난수
 * 2.사용자 입력 - 369 => int[3]
 *   123 ==> 0S - 1B //숫자는 같은데 자리가 같지 않으면 B++
 *   321 ==> 1S - 1B
 *   368 ==> 2S - 1B
 *   369 ==> 3S - 1B
 *           -------
 *   s => 3이면 종료
 * 
 */
public class 배열_5응용 {
	public static void process() {
		int[] com = new int[3];
		for(int i =0; i< com.length; i++) {
				com[i] = (int)(Math.random()*9)+1; //1-9
				for(int j = 0; j<i; j++) {
					if(com[i]==com[j]) {
						i--;
						break;
				}
		}
		}
		int[] user = new int[3]; //사용자 입력값 3자리
		//출력
		System.out.printf("%d%d%d\n",com[0],com[1],com[2]);
		//사용자 출력
		Scanner sc = new Scanner(System.in);
		 while(true) {
			 System.out.println("3자리 정수 업력: ");
			 int ip = sc.nextInt();
			 if (ip<100 || ip>999) {
				 System.out.println("잘못된 입력이다.");
				 continue;
			 }
			 //정상적으로 입력
			 user[0] = ip/100;
			 user[1] = (ip%100)/10;
			 user[2] = ip%10;
			 
			 //오류 체크
			 if(user[0] == user[1] ||
					 user[1] == user[2] || user[0] == user[2])
		 {
			 System.out.println("같은 수는 사용할 수 없다");
			 //처음부터 입력
			 continue;
		 }
		 if(user[0]==0 ||user[1]==0 ||user[2]==0 ) {
			 System.out.println("0은 사용할 수 없다");
			 //처음부터 입력
			 continue;
		 }
		 //유저가 입력한 숫자와 정답숫자를 비교하여 Strike인지 Ball인지 구분
		 int s =0, b=0;
		 for(int i =0; i<com.length;i++) {
			 for(int j = 0; j < user.length; j++) {
				 if(com[i]==user[j]) {//같은 수가 있다면 (com의 수 하나로 user의 수를 돌아가며 같은 수가 있으면)
					 if(i==j) //같은 자리에 있다면
						 s++;
					 else
						 b++;
				 }
			 }
		 }
		 System.out.println("input num:"+ip+", res:"+s+"S-"+b+"B");
		 
		 // 종료시
		 if(s==3) {
			 System.out.println("게임을 다시 할까요?(y|Y)");
			 char c = sc.next().charAt(0);

			 if (c=='Y'||c=='y') {
				 process();
			 }else {
				 System.out.println("게임오버!");
				 System.exit(0);
			 }
		 }

	}
}
	
		
	

	public static void main(String[] args) {
		process();


}
}