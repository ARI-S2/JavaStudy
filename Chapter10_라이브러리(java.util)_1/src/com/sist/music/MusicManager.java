package com.sist.music;

import java.io.FileReader;
import java.util.StringTokenizer;

// Music을 제어하는 프로그램
public class MusicManager {
	// 이 클래스 내부에서 모두 가져다 쓸 수 있도록 공유(static)변수 선언
	// 접속하는 모든 유저에게 공유 => 목록 => static
	private static Music[] ms = new Music[48];
	// 메모리 할당을 해서 값을 넣어야 하므로 클래스 블록에서 명시적 초기화 불가
	public MusicManager() {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\javaDev\\genie.txt");
			int i = 0;
			String md = "";
			while((i = fr.read()) != -1) {
				md += (char)i;
			}
			
			String[] mds = md.split("\n");
			i = 0;
			for(String s : mds) {
				StringTokenizer st = new StringTokenizer(s,"|");
				ms[i] = new Music();
				ms[i].setRank(Integer.parseInt(st.nextToken()));
				//    -int변수-        ---------int로 변형
				ms[i].setTitle(st.nextToken());
				ms[i].setSinger(st.nextToken());
				ms[i].setAlbum(st.nextToken());
				ms[i].setKey(st.nextToken());
				i++;
			}
		}catch (Exception e) {	
			// 에러 확인
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {}
		}
	}
	// 이 객체가 만들어지면 리턴해주는 메소드
	  public Music[] musicAllData()
	  {
		  return ms;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
