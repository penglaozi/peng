package com.study.pers;

import javax.swing.JFrame;

public class MyFrame {
	public static void main(String[] args){
		JFrame myFrame = new JFrame("My Frame");
		myFrame.setSize(400, 300);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
}
