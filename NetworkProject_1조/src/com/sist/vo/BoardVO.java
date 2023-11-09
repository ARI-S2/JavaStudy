package com.sist.vo;

import java.io.Serializable;
import java.util.*;

import javax.xml.crypto.Data;
// 한개의 게시물에 대한 정보를 가지고 있다
public class BoardVO implements Serializable{ // VO => value object  => 변수(사용자 정의 자료형)
	private int no; // 게시글 번호 => 구분자(중복X) ~> 수정, 삭제
	private String name;
	private String subject; // 제목
	private String content; // 내용
	private Date regdate; // 등록일
	private String pwd; // 비번 -> 수정, 삭제 시 본인여부 확인용
	private int hit; // 조회수
	
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}





	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public int getHit() {
		return hit;
	}


	public void setHit(int hit) {
		this.hit = hit;
	}


}
