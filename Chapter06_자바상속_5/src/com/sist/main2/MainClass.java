package com.sist.main2;
// 익명의 클래스 (상속보다 속도가 빠름)
// 클래스의 생성자 안에 멤버 클래스로 { }로 존제 => { 오버라이딩 메소드 }
// ~> 포함 클래스 에서 오버라이딩 => 익명의 클래스
// 이미 정의되어 있는 클래스의 멤버들을 재정의하여 사용할 필요 있을 때 => 일회성으로 이용
class Movie{
	void reserve(){
		System.out.println("무비 예약"); 
	}
	void list() {
		
	}
	void detail() {
		
	}
	void recommend() {
		
	}
}
class CGV extends Movie{

//	@Override => 접근지정어를 확대 가능 / private 같이 축소는 불가능
	public void reserve() {
		//super.reserve();
		System.out.println("CGV 예약"); 
		// 메소드 변경할거면 오버라이드 
		// 안할거면 super.메소드()해서 사용하면 됨
	}

	@Override
	void list() {
		super.list();
	}

	@Override
	void detail() {
		// TODO Auto-generated method stub
		super.detail();
	}

	@Override
	void recommend() {
		// TODO Auto-generated method stub
		super.recommend();
	}
	
}
class MegaBox extends Movie{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
		//super.reserve();
		System.out.println("메가 예약"); 
	}

	@Override
	void list() {
		// TODO Auto-generated method stub
		super.list();
	}

	@Override
	void detail() {
		// TODO Auto-generated method stub
		super.detail();
	}

	@Override
	void recommend() {
		// TODO Auto-generated method stub
		super.recommend();
	}
	// 확장 => super 클래스에서는 호출 불가
	public void print() {
		System.out.println("메가박스 프린트() 호출");
	}
}

public class MainClass {
	public static void main(String[] args) {
	CGV c = new CGV();
	c.reserve();
	
	MegaBox m = new MegaBox();
	m.reserve();
	
	// 관련된 클래스를 묶어서 한개의 객체 이용
	// 자료형보다 할당된 객체가 더 크면 잘려서 들어감
	// 생성자는 객체꺼로 호출
	Movie mm = new CGV(); //CGV 안에 메소드만 호출 가능

	mm.reserve();
	// 생성자와 클래스가 다른경우 => 오버라이딩된 메소드 호출
	mm = new MegaBox(); //mm은 print() 사용 불가
	mm.reserve();
	
	
	}

/*
 *   생성자와 클래스명이 다른 경우
 *   Movie m=new CGV()
 *   -----   ---------
 *   m을 통해 접근시에 => Movie에 안에 있는 메소드와 멤버변수에만 
 *                    접근이 가능 
 *   class Movie
 *   {
 *      int a=100;
 *      void print(){movie}
 *   }
 *   class CGV extends Movie
 *   {
 *      int b;
 *      void aaa(){}
 *      -------------메모리 
 *      int a=1000; => 멤버변수 오버라이딩
 *      void print(){cgv} => 메소드 오버라이딩 
 *      -------------
 *   }
 *   
 *   Movie m=new CGV();
 *           ----------
 *             |주소 변경
 *   m ==> a,print() => CGV가 가지고 있는 print()
 *   
 *   1) 변수 => 클래스명 
 *   2) 메소드 => 생성자 
 *   
 *   ==> 100개 
 *   ==> 분리 
 *   ==> 한개의 객체로 제어 ==> Object
 *   ==> 배열 
 *   Object[] obj={10,"aaa",10.5,'A',new Movie()};
 */
//Object o=10;
//int i=(int)o;

Object o=new CGV();

CGV cc=(CGV)o;

// 자바에서 => 클래스 객체를 리턴하는 메소드가 많이 존재 
//           -------------- Object


}



