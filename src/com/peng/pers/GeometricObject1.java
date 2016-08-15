package com.peng.pers;

public class GeometricObject1 {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**
	 * Ĭ�Ϲ��캯��
	 * @param args
	 */
	public GeometricObject1(){
		dateCreated = new java.util.Date();
	}
	
	/**
	 * ���캯��
	 * String color, boolean filled
	 */
	public GeometricObject1(String color, boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * ��ȡcolor
	 * @param args
	 */
	public String getColor(){
		return color;
	}
	
	/**
	 * ����color
	 * @param args
	 */
	public void setColor(String color){
		this.color = color;
	}
	
	/**
	 * �Ƿ������ɫ
	 * @param args
	 */
	public boolean isFilled(){
		return filled;
	}
	
	/**
	 * setFilled
	 * @param args
	 */
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	/**
	 * �õ���������
	 * @param args
	 */
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	/**
	 * ת�����ַ���
	 * @param args
	 */
	public String toString(){
		return "created on " + dateCreated + "\ncolor: " + color + " and filled :" + filled;
	}
}
