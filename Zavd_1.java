package Lab1;

import java.util.Scanner;

public class Zavd_1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double d;
		do{
			try{
				System.out.println("Input 'a':");
				a = in.nextDouble();
				System.out.println("Input 'b':");
				b = in.nextDouble();
				System.out.println("Input 'c':");
				c = in.nextDouble();
		
				d = Math.pow(b, 2)-4*a*c;
		
				if(d>0){
					System.out.println("D = "+d);
					x1 = (-b+Math.sqrt(d))/(2*a);
					x2 = (-b-Math.sqrt(d))/(2*a);
					System.out.println("x1 = "+x1);
					System.out.println("x2 = "+x2);
				}
				else if(d==0){
					System.out.println("D = "+d);
					x1=-(b/(2*a));
					System.out.println("x = "+x1);
				}else System.out.println("D < 0");
				System.out.println("Again (y/n)?");
			}catch(Exception e){
					System.out.println("You enter incorrect data!");
			}
				
		}while(!in.next().toLowerCase().equals("n"));
		in.close();
		System.out.println("Goodbye!");
	}

}
