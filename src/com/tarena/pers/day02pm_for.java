package com.tarena.pers;


public class day02pm_for {
	public static void main(String[] args){
		int nCount = 0;
		double dSum = 0.0;
		for(; nCount < 100; ++nCount){
			double dTemp = 1.0 / (nCount * 2 + 1);
			if(0 == nCount % 2)
				dSum = dSum + dTemp;
			else
				dSum = dSum - dTemp;
		}
		double dPi = 0.0;
		dPi = 4 * dSum;
		System.out.println(dPi);
	}
}
