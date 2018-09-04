package javaLogic;

public class Swapping {

	public static void main(String[] args) {
		 int x=10;
		 int y=5;
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println("x value is..."+x);
		 System.out.println("x value is..."+y);
		 
		 
		 int a=20;
		 int b=10;
		 a=a*b;
		 b=a/b;
		 a= a/b;
		 System.out.println("after swapping a value is.."+a+"...b value is..."+b);
		 
		 //using third variable
		 
		 int c=10;
		 int d=5;
		 int t;
		 t=c;
		c=d;
		d=t;
		
		System.out.println("c value is.."+c+"...d value is.."+d);
		
		 d=t;
		 
	}

}
