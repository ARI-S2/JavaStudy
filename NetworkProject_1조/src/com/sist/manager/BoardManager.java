package com.sist.manager;
import java.util.*; // ArraryList, Date

import com.sist.vo.BoardVO;

import java.text.*; // simpleDateFormat
import java.io.*; // File -> ObjextInputStream/ Output...

public class BoardManager implements Serializable{ // 게시물 목록 => 모아서 관리
	// staic 선언 => 모든 화면에서 공유 목적
	private static ArrayList<BoardVO> bList = new ArrayList<BoardVO>();
	
	//값 채우기
	static {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\board.txt");
			ois = new ObjectInputStream(fis);
			bList = (ArrayList<BoardVO>)ois.readObject();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	// 목록출력
	public ArrayList<BoardVO> boardListData(int page) {
		ArrayList<BoardVO> list = new ArrayList<>();
		int j = 0;
		int rowSize=10;//화면에 출력하는 갯수 
		int pagecnt=(page*rowSize)-rowSize;
		   /*
		    *   1page => 0~9  skip
		    *   2page => 10~19
		    *   3page => 20~29...
		    *   
		    */
		   // 오라클 => 인라인뷰 
		   // MySQL => LIMIT 
		
		// 최신 글부터 역출력
		ArrayList<BoardVO> temp = new ArrayList<>();
		for(int i = bList.size() -1 ; i >= 0 ; i--) {
			temp.add(bList.get(i));
		}
		for(int i = 0 ; i < temp.size() ; i++) {
			if(j<10 && i >= pagecnt) {
				BoardVO vo = temp.get(i);
				list.add(vo);
				j++; // 10개씩만 저장
			}
		}
		return list;
	}
	
	public int boardTotalPage() {
		return (int)(Math.ceil(bList.size()/10.0));
	}
	// 데이터 추가 ==
	public void boardInsert(BoardVO vo) {
		bList.add(vo); // 메모리 => 프로그램 종료시 사라짐
		fileSave();
	}
	
	public void fileSave() {
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	try {
		fos = new FileOutputStream("c:\\java_data\\board.txt");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(bList);
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		
		try {
		fos.close();
		oos.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	}


	// 상세보기
	public BoardVO boardDetailData(int no) {
		BoardVO vo = new BoardVO();
		for(int i = 0; i <bList.size(); i++) {
			BoardVO bvo = bList.get(i);
			if(bvo.getNo()==no) {
				bvo.setHit(bvo.getHit()+1); // 조회수 증가
				vo = bvo;
				fileSave(); // 파일과 arraylist가 동일
				break;
			}
		}
		return vo;
	}
	// 수정하기 ==
	public BoardVO boardUpdateData(int no) {
		BoardVO vo = new BoardVO();
		for(BoardVO bvo : bList) {
			if(bvo.getNo() == no) { // 원래 글 가지고 오기
				vo = bvo;
				break;
			}
		}
		return vo;
		
	}
	
	public String boardUpdate(BoardVO vo) {
		String result = ""; // YES/NO
		for(int i = 0; i < bList.size(); i++) {
			// i 가 필요한 경우 => remove , set
			BoardVO pvo = bList.get(i);
			if(pvo.getNo() == vo.getNo()) {
				if(pvo.getPwd().equals(vo.getPwd())) {
					// 비밀번호가 일치 => 수정
					//bList.set(i, vo);
					result = "YES";
					pvo.setContent(vo.getContent());
					pvo.setName(vo.getName());
					pvo.setSubject(vo.getSubject());
					
					fileSave();
				}
				else {
					// 비번 틀림
					result = "NO";
				}
			}
		}
		return result;
	}
	// 삭제하기 == 동일 코딩 => 파일에 저장
	// ArrayList 제어, 파일 제어 => 웹 => Manager 클래스 잘 보기!!!
	public String boardDelete(int no, String pwd) {
		String result = ""; // no, yes
		for(int i = 0; i < bList.size(); i++) {
			BoardVO vo = bList.get(i);
			if(vo.getNo() == no) {
				if(vo.getPwd().equals(pwd)) {
					result = "YES";
					bList.remove(i);
					fileSave();
				}else {
					result = "NO";
				}
				break;
			}
		}
		return result;
	}
	// 검색하기
	// 자동 증가번호 만들기 => seq
	public int boardSequence() {
		int  max = 0;
		for(BoardVO vo : bList) {
			if(vo.getNo() > max) {
				max = vo.getNo();
			}
		}
		return max+1;
	}
	// 공통 => 파일 저장
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}


}
