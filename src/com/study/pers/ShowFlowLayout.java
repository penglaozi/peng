package com.study.pers;

import javax.swing.*;
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame {
	/**
	 * 构造函数
	 */
	ShowFlowLayout(){
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		add(new JLabel("First name"));
		add(new JTextField(8));	//TextField允许编辑单行文本,此构造函数构造一个具有指定列数的新的空 TextField
		
		add(new JLabel("Middle name"));
		add(new JTextField(1));
		
		add(new JLabel("Last name"));
		add(new JTextField(8));
	}
	
	/**
	 * main函数
	 */
	public static void main(String[] args){
		ShowFlowLayout frame = new ShowFlowLayout();
		frame.setTitle("ShowFlowLayout");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
