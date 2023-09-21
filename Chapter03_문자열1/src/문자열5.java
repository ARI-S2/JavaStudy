
public class 문자열5 {

	public static void main(String[] args) {
		
		String s = "1상승";
		String id = s.replaceAll("[가-힣]", "");
		String st = s.replaceAll("[0-9]", "");
		System.out.println("id="+id);
		System.out.println("id="+st);
		System.out.println("up"+id);
		
		s = "Hello java!";
		String ss = s.replace("java", "C");
		System.out.println(ss);
		
	}

}
