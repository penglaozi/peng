package com.study.pers;

public class CountLettersInArray {
	public static void main(String[] args){
		char[] arrLetters = getArray();
		
		// test
		for(int nIndex = 0; nIndex < arrLetters.length; ++nIndex){
			System.out.print(arrLetters[nIndex]);
		}
		System.out.printf("\n");
		
		int[] arrCounts = countLetters(arrLetters);
		printCount(arrLetters, arrCounts);
	}
	
	/**
	 * 获得100个随机生成的小写字母
	 */
	public static char[] getArray(){
		char[] arrLetters = new char[100];
		for(int nIndex = 0; nIndex < arrLetters.length; ++nIndex){
			arrLetters[nIndex] = RandomCharacter.getRandomLowerCaseLetter();
		}		
		return arrLetters;
	}
	
	/**
	 * 统计各个字母出现的次数
	 */
	public static int[] countLetters(char[] arrLetters){
		int[] arrCounts = new int[26];
		for(int nIndex = 0; nIndex < arrLetters.length; ++nIndex){
			int nCountIndex = arrLetters[nIndex] - 97;
			arrCounts[nCountIndex]++;
		}
		return arrCounts;
	}
	
	/**
	 * 打印各个字母对应出现的次数
	 */
	public static void printCount(char[] arrLetters, int[] arrCounts){
		for(int nIndex = 0; nIndex < arrCounts.length; ++nIndex){
			System.out.print((char)(nIndex + 97));
			System.out.println(":	" + arrCounts[nIndex]);
		}
	}
}
