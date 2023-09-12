/*
 * 가장 기본이 되는 연산자: 산술연산자
 * 
 * 산술연산자 ㅣ + , - , * , / , %(나누고 나머지 값)
 * ------- 이항연산자 (피연산자 (연산 대상 2개) )
 * 
 */
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //+ (산술) 국영수 총점
		int kor = 89;
		int eng = 90;
		int math = 87;
		int total = kor + eng + math;
		double avg = total/3.0;
		System.out.println("국어점수: "+ kor);
		System.out.println("총점수: "+ total);
		System.out.println("평균: "+ avg); // 정수/정수는 정수가 되므로 3.0으로 나눠야 함 
		System.out.printf("평균:%.2f\n", avg); //printf( " % . n f " , 변수)
		int a = 5;
		int b = 2;
		System.out.println(a +"%"+ b + "=" + a%b);
		System.out.println(-a +"%"+ b + "=" + -a%b);
		System.out.println(a +"%"+ -b + "=" + a%-b);
		System.out.println(-a +"%"+ -b + "=" + -a%-b);
		System.out.println(100+10.5+'a'+"a"); // 연산은 같은 데이터형끼리만 연산 ~> 스트링은 따로! (참조변수 이므로)
		System.out.println('A'+'B'); // int 이하(byte, char, short)끼리의 연산은 int형으로 출력
		/*
a, b, v = map(int, input().split())
g = 0
d = 0
   
		 */
	}

}
