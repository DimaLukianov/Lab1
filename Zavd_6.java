package Lab1;

public class Zavd_6 {
	
	public static void main(String[] args) {
		int[][] mas = new int[4][4];
		int sum=0;
		
		//insert data
		for(int i = 0; i < mas.length; i++){
			for(int j = 0; j < mas[i].length; j++){
				mas[i][j]=(int) Math.round(Math.random()*10);
				System.out.print(mas[i][j]+"	");
			}
			System.out.println();
		}
		//----------------
		
		for(int i = 0; i < mas.length; i++){
			for(int j = 0; j < mas[i].length; j++){
				if(j<i){
					System.out.print(mas[i][j]+"	");
					sum+=mas[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("\nSum = "+sum);
		
	}

}
