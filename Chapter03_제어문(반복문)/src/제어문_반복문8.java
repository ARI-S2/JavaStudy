
//100번의 알파벳 난수 발생 ==> ABC갯수 확인
public class 제어문_반복문8 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		for(int i=0; i<=100; i++) {
			char ch = (char)((Math.random()*26)+65);//26개 알파벳 갯수 + 65는 알파벳의 시작
		if (ch=='A')
			a++;
		if (ch=='B')
			b++;
		if (ch=='C')
			c++;
		}
		System.out.printf("a,b,c 갯수: %d, %d, %d ",a,b,c);

	}

}
