package com.study.pers;

public class WriteData {
	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("score.txt");
		if(file.exists()){
			System.out.println("File already exists");
			System.exit(0);
		}
		
		//create a file 
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		output.print("John T Smith ");
		output.println(90);
		output.close();
	}
}
