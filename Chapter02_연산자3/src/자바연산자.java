/*
 *	변수 : 저장 공간. 자바 저장 공간을 설정(자료형, 데이터형)
 *		- 정수
 *			· byte(8bit) : -128 ~ 127 => 2진법(0,1)을 8개 채워서 숫자 한 개 저장
 *			· int(32bit) : -21억 4천 ~ 21억 4천 => 기본값(default) 컴퓨터에서 모든 숫자는 int를 인식
 *			· long(64bit) : 금융권, 빅데이터
 *		- 실수
 *			· double(64bit) : 소수점 15자리 이상 => 기본값(default)
 *		- 문자
 *			· char(16bit) : 0 ~ 65535(문자 번호) => 데이터가 숫자로 저장되며 음수 값은 존재하지 않음(각 문자마다 할당된 번호가 있음)
 *		- 논리
 *			· boolean(8bit) : true, false => 2진법(0,1)
 *			예) // 정수 3개 저장
 *				int a, b, c;
 *			// 실수 2개 저장
 *				double d1, d2;
 *			// 문자 1개 저장
 *				char c;
 *			// true/false
 *				boolean bb;
 *		=> 데이터 저장 → 데이터 가공(사용자 요청에 맞게) → 사용자 화면 출력
 *      => 프로그램(반복)      ㅣ
                          연산자
        자바에서 제공하는 연산자
        ------------------
        단항연산자 :
           = 증감연산자 (++,--) : 한개 증가, 감소
             ++a : i값을 1 증가 시킨 후에 다른 연산을 수행
             a++ : 다른 연산을 하고 1 증가
             --a : i값을 1 감소 시킨 후에 다른 연산을 수행
             a-- : 다른 연산을 하고 1 감소
           = 부정연산자 (!) : boolean에서만 사용 T <=> F
                           !(예약 가능한 날)
           = 형변환연산자(type) => 강제형변환
             -------- 객체지향 형변환
             숫자관련만 (정수, 실수,문자)
             ----------------------
               Upcasting : 데이터형을 크게 만듬 ~> 자동형변환
               Downcasting : 데이터형을 작게 만듬 ~> 강제형변환
                             char c = (char)65; c='a';
        *** 주의점 (산술규칙)
        - int 이하 연산식은 int로 변경
        char + byte = int
        char + char = int
        byte + byte = int
        
        이항연산자 :
          = 산술연산자 (+,=,*,/,%) 
            % : 숫자 자르기, 배수/약수 구하기 , 윤년 구하기
          = 비교연산자 (==,!=,<,>,<=,>=)
            유니코드(모든 언어 사용 가능) 한글자당 2바이트 => 영어 1바이트 / 한글 2바이트
          = 논리연산자 (&&,||)
            && : 둘 다 true
            || : 하나만 true여도 true
          = 대입연산자 (=, +=, -=)
        삼항연산자 : 조건연산자 ?:
        
 */
import java.util.Scanner;
public class 자바연산자 {

	public static void main(String[] args) {
		int kor, eng, math;
		double avg;
		int total;
		// new 객체생성
		Scanner sc = new Scanner(System.in);
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total/3.0;
		
		System.out.println("평균 : "+ avg);
		System.out.print(avg >= 90 && avg <= 100 ? "A학점" : "");
		System.out.print(avg >= 80 && avg <= 90 ? "B학점" : "");
		System.out.print(avg >= 70 && avg <= 80 ? "C학점" : "");
		System.out.print(avg >= 60 && avg <= 70 ? "D학점" : "");
		System.out.print(avg < 60 ? "F학점" : "");

	}



}