
public class 자바데이터형변경 {

	public static void main(String[] args) {
		int _int = (int)100.987765; //강제 형변환 => 소수점 아래 버림
		System.out.println("_in:"+_int);
		
		byte _byte = (byte)300; //300을 바이트로 바꿨으니 오류는 안나지만 형이 변환되어 저장 / 0,1인 이진법으로 128까지 짤려서 그 전 2승만 저장되어 44로 저장 )
		// 00101100
		System.out.println(0b00101100); //0b를 넣으면 2진법을 10진법으로 변환
	}

}
