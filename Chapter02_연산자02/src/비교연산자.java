/*
 * 비교연산자
 * ------- 사용처 (조건문. 반복문)
 * 숫자(정수, 실수, boolean, 문자) => 문자열은 비교할 수 없다
 * --------------------------
 * 문자는 어떤 연산자를 사용해도 정수형으로 변경
 * 
 * 
 */
public class 비교연산자 {
	public static void main(String[] args) {
		int a = (int)(Math.random()*100)+1;
		       //    ------------------
		      //-----                  
		     //                         ---
	    int b = (int)(Math.random()*100)+1;
	    System.out.println("a==b: "+ (a==b));
	    System.out.println("a!=b: "+ (a!=b));
	    System.out.println("a<b: "+ (a<b));
	    System.out.println("a>b: "+ (a>b));
	    System.out.println("a<=b: "+ (a<=b));
	    System.out.println("a>=b: "+ (a>=b));
	    
	    char c = (char)((Math.random()*26) + 65);
	    char d = (char)((Math.random()*26) + 65);//26사이의 값에 따라 알파벳 출력
	    System.out.println("c= "+ c);
	    System.out.println("d= "+ d);
	    System.out.println("c == d ? "+ (c==d));
	    
	    boolean b1 = false;
	    boolean b2 = true;
	    System.out.println("b1==b2"+(b1==b2));
	    System.out.println("b1!=b2"+(b1!=b2));
	}

}
