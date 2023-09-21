
public class 자바_문제 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int cnt =0;
		while(true) {
			a = (int)(Math.random()*6)+1;
			b = (int)(Math.random()*6)+1;
			System.out.println(a+" "+b);
			cnt++;
			if(a==b) {
				System.out.println("같은 주사위는 "+a+" "+b);
				System.out.println("총 횟수는 "+cnt);
				break;
			}

	}
	}
}
