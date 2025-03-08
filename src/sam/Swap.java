package sam;

import java.util.Scanner;

public class Swap {
	int i,j;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a, b values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Swap s = new Swap(a, b);
		
		

	}
	Swap(int i, int j){
		this.i=i;
		this.j=j;
		int temp;
		temp=i;
		i=j;
		j=temp;
		System.out.println("Swapped Values: "+i + " and "+ j);
	}

}
