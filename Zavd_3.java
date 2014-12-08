package Lab1;

import java.util.Scanner;

public class Zavd_3 {

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
		
		//algorithm Insert
		int j, temp;
		for(int i=0;i<mas.length;i++){
			temp=mas[i];
			for(j=i-1; j>=0 && mas[j]>temp;j--){
				mas[j+1]=mas[j];
			}
			mas[j+1]=temp;
		}
		
		//output
		System.out.println("__________________________\nResult:");
		for(int i=0;i<mas.length;i++){
			System.out.print(mas[i]+"	");
		}

	}

}
