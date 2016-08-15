package com.peng.pers;

public class GeometricObject1 {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**
	 * 默认构造函数
	 * @param args
	 */
	public GeometricObject1(){
		dateCreated = new java.util.Date();
	}
	
	/**
	 * 构造函数
	 * String color, boolean filled
	 */
	public GeometricObject1(String color, boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * 获取color
	 * @param args
	 */
	public String getColor(){
		return color;
	}
	
	/**
	 * 设置color
	 * @param args
	 */
	public void setColor(String color){
		this.color = color;
	}
	
	/**
	 * 是否填充颜色
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
	 * 得到创建日期
	 * @param args
	 */
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	/**
	 * 转换成字符串
	 * @param args
	 */
	public String toString(){
		return "created on " + dateCreated + "\ncolor: " + color + " and filled :" + filled;
	}
}
