package com.sist.music;
// 1. 데이터형 클래스(게터세터)
/* 2-1) 데이터 매이저 클래스에서 데이터형 클래스를 객체화(대부분 배열)
     2) 값을 넣고 ( 파일일기, 토큰별로 잘라서 데이터형 객체에 넣어주기) 
	 3) 만든 객체를 리턴해주는 메소드 생성
   3-1) user 클래스에서 매니저 클래스 객체화(호출)
     2) 그 객체 안에 있는 리턴 메소드 호출
     3) 리턴된 객체(배열)을 하나하나 원하는 변수만 출력
*/
public class UserMain {

	public static void main(String[] args) {
		// 뮤직매니저 객체 생성해서 뮤직 데이터를 담은 배열을 만든다음
		MusicManager m = new MusicManager();
		// 그 객체배열 리턴메소드 이용해서 가져옴
		Music[] mc = m.musicAllData();
        for(Music mm:mc) 
        {
        	System.out.println(mm.getRank()+"."+mm.getTitle());
        	// 그중에 가져오고 싶은 변수만 원하는 형식으로 출력
        }
	}

}
