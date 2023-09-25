import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("년도 입력");
	int y = sc.nextInt();
	
	System.out.println("월 입력");
	int m = sc.nextInt();
	
	System.out.println("일 입력");
	int d = sc.nextInt();
	
	Calendar cal = Calendar.getInstance();
	// 메모리 할당 => 싱글턴 (한개만 설정)
	cal.set(Calendar.YEAR, y);
	cal.set(Calendar.MONTH, m-1); //0번이 1월이라 저장할 때 -1
	cal.set(Calendar.DATE, d);
	
	char[] strWeek = {'일','월','화','수','목','금','토'};
	int week = cal.get(Calendar.DAY_OF_WEEK); // 요일 읽기 -> 1-7로 저장되어서 -1필요
	System.out.println();
	
	System.out.println(y+"년도 "+m+"월 "+d+"일은 "+strWeek[week-1]+"요일이다");
	}

}
