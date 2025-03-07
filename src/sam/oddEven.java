package sam;

import java.util.Scanner;

public class oddEven {
	int i;

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter values to check if it even or odd: ");
		int a = sc.nextInt();
		
		oddEven od ;
		od=new oddEven(a);
		
		
	}

	oddEven(){
		System.out.println("Default constructor!");
	}
	oddEven(int i){
		this.i=i;
		if(i%2==0) {
			System.out.println("Even Number!");
		}else {
			System.out.println("Odd Number!");
		}
				
	}
	
}
