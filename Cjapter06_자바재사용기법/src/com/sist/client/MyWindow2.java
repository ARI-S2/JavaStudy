package com.sist.client;
import javax.swing.*;
import java.net.*;
import java.awt.*;

public class MyWindow2 extends JFrame {
	JLabel la = new JLabel();
	
	public MyWindow2() {
		setLayout(null);
		la.setBounds(10,15,350,500);
		add(la);
		try {
			URL url = new URL("https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87433/87433_320.jpg");
			la.setIcon(new ImageIcon(url));
		}catch (Exception e) {
			// TODO: handle exception
		}
		setSize(800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	new MyWindow2();
	}
}
