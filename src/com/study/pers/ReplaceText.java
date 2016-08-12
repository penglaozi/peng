package com.study.pers;

import java.io.*;
import java.util.*;

public class ReplaceText {
	public static void main(String[] args) throws Exception{
		if(args.length != 4){
			System.out.println("Usage: java replacetext");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		if(!sourceFile.exists()){
			System.out.println("源文件不存在！");
			System.exit(0);
		}
		
		File targetFile = new File(args[1]);
		if(!targetFile.exists()){
			System.out.println("目标文件不存在！");
			System.exit(0);
		}
		
		Scanner input = new Scanner(sourceFile);
		PrintWriter output = new PrintWriter(targetFile);
		
		while(input.hasNext()){
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[2], args[3]);
			output.println(s2);
		}
		
		input.close();
		output.close();
	}
}
