package sam;

import java.util.Scanner;

public class consonant {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the String: ");
		String name = sc.next();
		
		int vowelCount=0;
		int ConsonantCount=0;
		
		
		for(char ch:name.toCharArray()){
//			System.out.println(ch);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowelCount++;
			}else { 
				ConsonantCount++;
			}
		}
		if (vowelCount>0 && ConsonantCount>0) {
			System.out.println("this string has both vowels and consonants!");
		}else if(vowelCount>0) {
			System.out.println("this string has only vowels ");
		}else if(ConsonantCount>0) {
			System.out.println("This string has only Consonants");
		}else {
			System.out.println("This String has no values!");
		}

		
		
	}

}
