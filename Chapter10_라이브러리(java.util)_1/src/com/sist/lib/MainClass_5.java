package com.sist.lib;
import java.util.StringTokenizer;

public class MainClass_5 {

	public static void main(String[] args) {
	String data = "red|green|blue|pink|yellpow|cyan|magenta";
	// 정규식으로 |를 자를땐 \\ 줘야돼서 불편하므로 토크나이저 사용
	StringTokenizer st = new StringTokenizer(data,"|");
	System.out.println("토큰개수: "+ st.countTokens());
	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
	}

	}

}
