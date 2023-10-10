package com.sist.main;

import java.util.*;
import java.io.*;

class Music{
	String rank;
	String title;
	String singer;
	String album;
	String key;
}

//데이터형을 모아서 관리
class MusicData{
	// 사용자 정의 데이터형도 배열 가능 / 단 new로는 아직 생성 안됨 
	Music[] musics = new Music[49]; // 2번
	// 초기화
	//1. 초기화 블록 2. 생성자
	//{ 구현 } => 초기화 블록 => 자동 생성
	{
		// 파일읽기 => 예외처리 => 에러를 미리 방지 => check, uncheck
		try{
			FileReader fr = new FileReader("c:\\javaDev\\genie.txt");
			// 파일리더는 한글자씩 정수로 받아서 읽어옴다
			String data = "";
			int i = 0; // int로 받아서 char 변환
			while((i = fr.read() )!= -1) {
				data += (char)i;
			}	
			fr.close();
			//System.out.println(data);
			String[] datas = data.split("\n");
			
			// 각각의 음악배열의 음악 객체 생성
			i = 0;
			for(String s : datas) {
				String[] ss = s.split("\\|");
				musics[i] = new Music(); // 3번 => 이때 실제 music 객체 생성
				if(ss[0].equals("47"))
					continue;
				musics[i].rank = ss[0];
				musics[i].title = ss[1];
				musics[i].singer = ss[2];
				musics[i].album = ss[3];
				musics[i].key = ss[4];
				i++;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

//제어
public class MusicMain {

	public static void main(String[] args) {
		MusicData md = new MusicData(); // 1번 
		System.out.println("===============음악 top 50================");
		for(int i = 0; i < md.musics.length;i++) { 
			System.out.println("순위:"+md.musics[i].rank);
			System.out.println("곡명:"+md.musics[i].title);
			System.out.println("가수명:"+md.musics[i].singer);
			System.out.println("앨범:"+md.musics[i].album);
			System.out.println("동영상 키:"+md.musics[i].key);
		}
		
		// 상세보기
		Scanner sc = new Scanner(System.in);
		System.out.println("동영상 선택(1-50사이 => 47 제외): ");
		int mno = sc.nextInt();
		// 상세보기 객체 생성
		Music mm = md.musics[mno-1]; //인덱스번호는 0번부터기에 입력값 -1
		System.out.println("========= 상세보기 =======");
		System.out.println("순위: "+mm.rank);
		System.out.println("곡명:"+mm.title);		
		System.out.println("가수명:"+mm.singer);
		System.out.println("앨범:"+mm.album);
		System.out.println("동영상 키:"+mm.key);
		
		// 동영상 실행
		System.out.println("동영상을 실행 할까요? (y|n)");
		char c = sc.next().charAt(0);
		if(c =='y' || c == 'Y') {
			try {
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
						+"http://youtube.com/embed/"+mm.key);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		else {
			System.out.println("프로그램 종료");
			
		}

	}

}
