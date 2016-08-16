package com.study.pers;

import java.awt.*;
import javax.swing.*;
import java.io.File;

public class TestPanels extends JFrame {
	private ImageIcon icon = new ImageIcon("image/timg.jpg");
	
	public TestPanels(){
		JPanel jPnlOne = new JPanel();
		jPnlOne.setLayout(new GridLayout(4, 3));
		
		for(int nIndex = 0; nIndex <= 8; ++nIndex){
			jPnlOne.add(new JButton("" + nIndex));
		}
		
		JButton jBtnNumber = new JButton("" + 0);
		jBtnNumber.setBackground(Color.RED);
		jBtnNumber.setForeground(new Color(0, 0, 255));
		jBtnNumber.setToolTipText("this is number 0");
		jPnlOne.add(jBtnNumber);
		
		//JButton jBtnStart = new JButton(icon);
		//jPnlOne.add(jBtnStart);
		jPnlOne.add(new JButton("Start"));
		
		jPnlOne.add(new JButton("Stop"));
		
		JPanel jPnlTwo = new JPanel(new BorderLayout());
		jPnlTwo.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
		jPnlTwo.add(jPnlOne, BorderLayout.CENTER);
		
		// add contents into the frame
		add(jPnlTwo, BorderLayout.EAST);
		add(new JButton("Food to be placed here"), BorderLayout.CENTER);
	}
	
	/**
	 * 主函数
	 */
	public static void main(String[] args){
		TestPanels objFrame = new TestPanels();
		objFrame.setTitle("The Front View of a Microwave Oven");
		objFrame.setSize(400, 250);
		objFrame.setLocationRelativeTo(null);
		objFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objFrame.setVisible(true);
		
		//打印系统中所有可用字体的名字
		//displaySysFont();
		
		// test
		File file = new File("image/timg.jpg");
		if(file.exists()){
			System.out.println("文件存在");
		}else{
			System.out.println("文件不存在");
		}
		
	}
	
	/**
	 * 打印系统中所有可用字体的名字
	 */
	public static void displaySysFont(){
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = e.getAvailableFontFamilyNames();
		
		for(int nIndex = 0; nIndex < fontNames.length; ++nIndex){
			System.out.println(fontNames[nIndex]);
		}
	}
}
