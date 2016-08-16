package com.study.pers;

import javax.swing.*;
import java.awt.event.*;

public class HandleEvent extends JFrame {
	public HandleEvent(){
		//create two buttons
		JButton jBtnOK = new JButton("OK");
		JButton jBtnCancel = new JButton("Cancel");
		
		//create a panel to hold two buttons
		JPanel jPnlHold = new JPanel();
		jPnlHold.add(jBtnOK);
		jPnlHold.add(jBtnCancel);
		
		//add panel to frame
		add(jPnlHold);
		
		//register listeners
		OKListenerClass listenerOK = new OKListenerClass();
		CancelListenerClass listenerCancel = new CancelListenerClass();
		jBtnOK.addActionListener(listenerOK);
		jBtnCancel.addActionListener(listenerCancel);		
	}
	
	public static void main(String[] args){
		JFrame frame = new HandleEvent();
		frame.setTitle("Handle Event");
		frame.setSize(200, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class OKListenerClass implements ActionListener {
	public void actionPerformed(ActionEvent e){
		System.out.println("OK button clicked");
	}
}

class CancelListenerClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Cancel button clicked");
	}
}
