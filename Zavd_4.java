package Lab1;

import java.util.Scanner;

public class Zavd_4 {

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
		
		//algorithm Select
		int index=0;
		int min=0;
		for(int i=0;i<mas.length;i++){
			min=mas[i];
			index=i;
			for(int j=i+1;j<mas.length;j++){
				if(mas[j]<min){
					index=j;
					min=mas[j];
				}
			}
			if(mas[i]!=mas[index]){
				mas[index] = mas[i];
				mas[i]=min;
			}
		}
		
		//output
		System.out.println("__________________________\nResult:");
		for(int i=0;i<mas.length;i++){
			System.out.print(mas[i]+"	");
		}
	}

}
