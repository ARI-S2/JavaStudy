package com.sist.client;

import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import javax.swing.table.*;
import com.sist.vo.*;
import com.sist.manager.*;
import java.util.*;
import java.text.*;
public class BoardListPanel extends JPanel
implements ActionListener, MouseListener
{
	JLabel la,pageLa;
	JButton b1,b2,b3,b4;
	JTable table;
	DefaultTableModel model;
	ControllPanel cp;// 화면 변경 ==> <jsp:include>
	int curpage=1;
	int totalPage=0;
	BoardManager bm=new BoardManager();
    public BoardListPanel(ControllPanel cp)
    {
		this.cp=cp; // 새로운 cp를 넘겨주면 오류남 => 떠있는 창을 넘겨준다
		String[] col= {"번호","제목","이름","작성일","조회수"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false; // 편집방지
			}
			// 익명의 클래스 => 오버라이딩 (상속없이)
			// 편집 방지 
			
		};
		table=new JTable(model);
		table.getTableHeader().setReorderingAllowed(false); // 게시판 제목탭 이동하지못하게 방지
		table.setShowVerticalLines(false);
		table.setRowHeight(58); // 게시판의 목록의 간격을 조정
		
		table.getColumn("번호").setPreferredWidth(30); // 번호,제목,.. 칸의 너비 조절
		table.setFont(new Font("맑은 고딕",Font.PLAIN,14));
		table.getColumn("제목").setPreferredWidth(400);
		table.getColumn("이름").setPreferredWidth(100);
		table.getColumn("작성일").setPreferredWidth(150);
		table.getColumn("조회수").setPreferredWidth(50);
		table.getColumn("번호").setCellRenderer(null);
		table.getTableHeader().setPreferredSize(new Dimension(30,30)); // 방이름 탭 높이 
				
		JScrollPane js=new JScrollPane(table);
		 
		b1=new JButton("     새글     ");
		b1.setFont(new Font("맑은 고딕",Font.PLAIN,15)); // 새글 폰트 크기
		b2=new JButton("     검색     ");
		b3=new JButton("이전");
		b3.setFont(new Font("맑은 고딕",Font.PLAIN,14)); // 이전 폰트 크기 
		b4=new JButton("다음");
		b4.setFont(new Font("맑은 고딕",Font.PLAIN,14)); // 다음 폰트 크기 
		la=new JLabel("자유게시판");
		pageLa=new JLabel("1 page / 1 pages");
		pageLa.setFont(new Font("맑은 고딕",Font.PLAIN,15)); // page 폰트 크기 
		
		// 배치
		setLayout(null); // 사용자 정의 배치
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("맑은 고딕",Font.BOLD,35)); // 보통의 글자크기 default 20
		la.setBounds(0, 15, 1260, 50);
		add(la);
		
		b1.setBounds(1160, 75, 100, 30);
		b1.setFont(new Font("맑은 고딕",Font.BOLD,15));
		add(b1);
		
		js.setBounds(0, 115, 1260, 610);
		add(js);
		
		JPanel p=new JPanel();
		p.setFont(new Font("맑은 고딕",Font.PLAIN,15)); // 페이지 쪽 폰트 크기
		p.add(b3);	// 순서대로 해줘야함
		p.add(pageLa);
		p.add(b4);
		
		p.setBounds(0, 765, 1260, 35);
		add(p);
		
		// 이벤트 등록 => b1을 누르면 이 클래스가 갖고있는 메소드를 호출해라
		b1.addActionListener(this);
		b3.addActionListener(this); // 이전
		b4.addActionListener(this); // 다음
		table.addMouseListener(this);
		// this => 처리하는 메소드 위치 => 클래스 내부에 존재
		boardList();
	}
    
    public void boardList()
    {
    	// 전체를 지운다 
    	for(int i=model.getRowCount()-1;i>=0;i--)
    	{
    		model.removeRow(i);
    	}
    	ArrayList<BoardVO> list=bm.boardListData(curpage);
    	totalPage=bm.boardTotalPage();
    	pageLa.setText(curpage+" page / "+totalPage+" pages");
    	for(int i=0;i<list.size();i++)
    	{
    		BoardVO vo=list.get(i);
    		String[] data= {
    			String.valueOf(vo.getNo()),
    			vo.getSubject(),
    			vo.getName(),
    			new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()),
    			String.valueOf(vo.getHit())
    		};
    		
    		model.addRow(data);
    	}
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)//b1을 클릭했다면 
		{
			cp.bip.tf1.setText("");
			cp.bip.tf2.setText("");
			cp.bip.tf3.setText("");
			cp.bip.ta.setText("");
			cp.card.show(cp, "insert");
		}
		else if(e.getSource() == b3){
			if(curpage > 1) {
				curpage--;
				boardList();
			}
		}
		else if(e.getSource() == b4) {
			if(curpage < totalPage) {
				curpage++;
				boardList();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == table) {
			if(e.getClickCount()==2) {// 더블 클릭
				//게시물 번호 가지고 오기
				int row = table.getSelectedRow();
				String no = model.getValueAt(row, 0).toString(); // obj를 문자열로 변환 => 젤 왼쪽 열들
//				JOptionPane.showMessageDialog(this, no);
				// => 윈도우, 웹 => 클라이언트(전송) => 서버(응답)
				//                -----------> 문자열로 전송
				//                             ----> 해당 데이터로 변경(Wrapper)
				/*
				 * string.valueOf() => 기본형으로 변환
				 * .toString => 문자열로만 출력
				 */
				BoardVO vo = bm.boardDetailData(Integer.parseInt(no));
				cp.bdp.noLa.setText(no);
				cp.bdp.nameLa.setText(vo.getName());
				cp.bdp.subLa.setText(vo.getSubject());
				cp.bdp.hitLa.setText(String.valueOf(vo.getHit()));
				cp.bdp.pane.setText(vo.getContent());
				cp.bdp.dateLa.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate())); // 대문자 MM필요
				cp.card.show(cp, "detail");
			}
		}
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}