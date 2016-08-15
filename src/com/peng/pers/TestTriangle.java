package com.peng.pers;

public class TestTriangle {
	public static void main(String[] args){
		Triangle cTriangle = new Triangle(1.0, 1.5, 1.0);
		cTriangle.setColor("yellow");
		cTriangle.setFilled(true);
		System.out.println("面积：" + cTriangle.getArea());
		System.out.println("周长：" + cTriangle.getPerimeter());
		System.out.println("颜色：" + cTriangle.getColor());
		System.out.println("是否填充：" + cTriangle.isFilled());
	}
}
