package com.sist.main2;
// 상수는 초기값을 할당!
// static final int 상수
// final int 상수형 변수
// int 변수
public interface Controller {
	int a = 0; // static final public 자동 추가
	public void execute();
	 // 구현을 할꺼면 => {} default를 줘서 상속받을 객체에서 바꿀 수 있도록 하던가 
	// 				    static을 줘서 변경 금지하던가
	default void aaa() { // 자동 public 선언
		
	}
}
