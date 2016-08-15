package com.peng.pers;

public class Triangle extends GeometricObject1 {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	/**
	 * 默认构造函数
	 */
	public Triangle(){
		
	}
	
	/**
	 * 带形参的构造函数
	 */
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/**
	 * 获取三条边的长度
	 */
	public double[] getSides(){
		double[] arrSides = {side1, side2, side3};
		return arrSides;
	}
	
	/**
	 * 设置三条边的长度
	 */
	public void setSides(double[] arrSides){
		side1 = arrSides[0];
		side2 = arrSides[1];
		side3 = arrSides[2];
	}
	
	/**
	 * 返回三角形的面积
	 */
	public double getArea(){
		double dPerimeter = (side1 + side2 + side3) / 2.0;
		double dArea = dPerimeter * (dPerimeter - side1) * (dPerimeter - side2) * (dPerimeter - side3);
		return Math.sqrt(dArea);
	}
	
	/**
	 * 返回三角形的周长
	 */
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	
	/**
	 * 返回三角形的字符串描述
	 */
	public String toString(){
		String strSides = "the length of sides is: " + side1 + " " + side2 + " " + side3;
		String strArea = " and the area of triangle is: " + this.getArea();
		String strPerimeter = " and the perimeter of triangle is: " + this.getPerimeter();
		return strSides + strArea + strPerimeter;
	}
}
