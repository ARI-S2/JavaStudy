
public class 선택문_4 {

	public static void main(String[] args) {
		char s = (char)((Math.random()*6)+65); // A B C D E F
		System.out.println("score: "+s);
		switch(s) {
		default:
			System.out.println("존재하지 않는 등급");
			//break;
		
		case 'A':
			System.out.println("A등급은 90-100사이 점수");
			//break;
		case 'B':
			System.out.println("B등급은 80-90사이 점수");
			//break;
		case 'C':
			System.out.println("C등급은 70-80사이 점수");
			//break;
		case 'D':
			System.out.println("D등급은 60-70사이 점수");
			//break;
		}
	}

}
