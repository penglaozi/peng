package com.peng.pers;

public class TestTriangle {
	public static void main(String[] args){
		Triangle cTriangle = new Triangle(1.0, 1.5, 1.0);
		cTriangle.setColor("yellow");
		cTriangle.setFilled(true);
		System.out.println("�����" + cTriangle.getArea());
		System.out.println("�ܳ���" + cTriangle.getPerimeter());
		System.out.println("��ɫ��" + cTriangle.getColor());
		System.out.println("�Ƿ���䣺" + cTriangle.isFilled());
	}
}
