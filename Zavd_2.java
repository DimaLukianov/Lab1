package Lab1;

import java.util.Scanner;

public class Zavd_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] mas = new int[10];
		int x;
		try{
		for(int i=0;i<mas.length;i++){
			System.out.print("Input "+(i+1)+" element:");
			mas[i]=in.nextInt();
		}
		System.out.print("Input X:");
		x=in.nextInt();
		System.out.println("Array:");
		for(int i=0;i<mas.length;i++){
			if(mas[i]>x)System.out.print(mas[i]+"	");
		}
		}catch(Exception e){
			System.out.println("You enter incorrect data!");
		}
	}

}
