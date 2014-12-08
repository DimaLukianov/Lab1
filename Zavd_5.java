package Lab1;

import java.util.Scanner;

public class Zavd_5 {
	
	private static void swap(int []mas, int index){
		int temp = mas[index-1];
		mas[index-1] = mas[index];
		mas[index] = temp;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] mas = new int[10];
		
		//input
		try{
		for(int i=0;i<mas.length;i++){
			System.out.print("Input "+(i+1)+" element:");
			mas[i]=in.nextInt();
		}
		}catch(Exception e){
			System.out.println("You enter incorrect data!");
		}
		
		//algorithm Bubble
		for(int i=1; i<mas.length; i++){
			for(int j=mas.length-1; j>=i; j--){
				if(mas[j-1] > mas[j])swap(mas,j);
			}
		}
		
		//output
		System.out.println("__________________________\nResult:");
		for(int i=0;i<mas.length;i++){
			System.out.print(mas[i]+"	");
		}
	}

}
