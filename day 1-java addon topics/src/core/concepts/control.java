package core.concepts;

import java.util.Scanner;

public class control {


	public static void main(String[] args) {
		/*
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the martial status :(married/unmarried):");
		String ms=in.nextLine().toLowerCase();
		
		
		if(ms.equals("married")) {
		System.out.println("you are eligible to the insurance");
		}
		else if(ms.equals("unmarried")) {
			System.out.println("enter the below details");
			System.out.println("enter the gender:(male/female):");
			
			
			String gender=in.nextLine().toLowerCase();
			
			if(gender.equals("male")) {
			
		}
		
			else if(gender.equals("female")){
			
		} 
			
		else {
			System.out.println("invalid gender input");
			
		}
		}else {
			System.out.println("invalid marital status");
			
		}

	}

}
*/

		
		
		
		
		
		
Scanner in=new Scanner(System.in);
		
		System.out.println("enter the martial status :(married/unmarried):");
		String ms=in.nextLine().toLowerCase();
		
		if(ms.equals("married")) {
		System.out.println("you are eligible to the insurance");
		}
		else if(ms.equals("unmarried")) {
			System.out.println("enter the below details");
			System.out.println("enter the gender:(male/female):");
			String gender=in.nextLine().toLowerCase();
			
			
			
			
			
			
			
			if(gender.equals("male") || gender.equals("female")) {
			System.out.println("enter your age");
			int age=in.nextInt();
			if(gender.equals("male")&& age>30) {
				System.out.println("you are eligible to the insurance");
			
			} 
			
			else if(gender.equals("female")&& age>25) {
					System.out.println("you are eligible to the insurance");
				}
			
			else {
			System.out.println("invalid gender input");
			
		
		}
			}
	else {
			System.out.println("invalid marital status");
			
		

	}
		
		
		}
	}
}
	
	
	