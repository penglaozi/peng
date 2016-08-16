package com.study.pers;

import javax.swing.*;

public class MyFrame {
	public static void main(String[] args){
		JFrame myFrame = new JFrame("My Frame");
		
		JButton jBtnOK = new JButton("ºÃµÄ");
		myFrame.add(jBtnOK);
		
		myFrame.setSize(400, 300);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
}
