/*
 *  int a = 10;
 *  a *= 20; ==> a = 200;
 *  
 *  int a = 10;
 *  a/=3; ==> a=a/3 ==> a=10/3 ==> a=3
 *  

 */
public class 복합대입연산자 {

	public static void main(String[] args) {

		int a = 10;
		//a를 100증가
		a += 100;
		System.out.println(a);
		a -= 50;
		System.out.println(a);
		
		int b = 10;
		b *= 20;
		System.out.println(b); //b =200
		b /= 3;
		System.out.println(b);
	}

}
