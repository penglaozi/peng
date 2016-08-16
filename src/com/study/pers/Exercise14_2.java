package com.study.pers;

public class Exercise14_2 {
	public static void main(String[] args){
		ComparableCircle circleOne = new ComparableCircle(5);
		ComparableCircle circleTwo = new ComparableCircle(15);
		
		ComparableCircle circleThr = (ComparableCircle)Max.max(circleOne, circleTwo);
		System.out.println("The max circle's radius is " + circleThr.getRadius());
		System.out.println(circleThr);
	}
}


class ComparableCircle extends Circle implements Comparable{

	public ComparableCircle(double radius){
		super(radius);
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(getRadius() > ((ComparableCircle)o).getRadius())
			return 1;
		else if(getRadius() < ((ComparableCircle)o).getRadius())
			return -1;
		else
			return 0;
	}
}

class Max{
	public static Comparable max(Comparable c1, Comparable c2){
		if(c1.compareTo(c2) > 0)
			return c1;
		else
			return c2;
	}
}