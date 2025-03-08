package Arrays;

import java.util.Arrays;

public class insertElementInArray {
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int newElement = 25;
		int newPosition =2;
		
		int[] newArr = new int[arr.length+1];
		
		for(int i=0,j=0;i<newArr.length;i++) {
			if(i==newPosition-1) {
				newArr[i]=newElement;
			}else {
				newArr[i]=arr[j++];
			}
		}
		System.out.println("New array: "+Arrays.toString(newArr ));
	}
}
