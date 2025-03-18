package core.concepts;

import java.util.Scanner;

public class inputoutput {
 public static void main(String args[]) {

 System.out.println("hi");
 
 Scanner in=new Scanner (System.in);
 
    System.out.println("get the integer input");;
	int a=in.nextInt();
	System.out.println("get byte input");
	int b = in.nextInt();
	System.out.println("get short input");
	short c=in.nextInt();
	System.out.println("get long input");
	long d= in.nextInt();
	System.out.println("get boolean input");
	boolean e=in.nextBoolean();
	System.out.println("get double input");
	double f=in.nextInt();
	System.out.println("get float input");
	float g=in.nextInt();
	System.out.println("get caharacter input");
	char h=in.next().charAt(0);
	
	
	
	System.out.println("integer input result:" +a);
	System.out.println("byte input result:" +b);
	System.out.println("short input result:" +c);
	System.out.println("boolean input result:" +d);
	System.out.println("integer input result:" +e);
	System.out.println("double input result:" +f);
	System.out.println("float input result:" +g);
	System.out.println("char input result:" +h);
	
	
	
 
 
 
	System.out.println("get the input:");
	char h=in.next().charAt(0);
	System.out.println("enter ");
	System.out.println("char input result:" +h);
	
 
 
 
 
 }
 
 
 
}
