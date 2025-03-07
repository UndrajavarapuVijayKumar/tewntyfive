package patterns;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of rows: ");
		int numberOfRows = sc.nextInt();
		System.out.println("No. of Columns: ");
		int numberOfColumns = sc.nextInt();
		
		for(int i=numberOfRows;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}

		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}
