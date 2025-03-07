package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge2arrays {
	public static void main(String[] args) {
		String [] refresh = {"chai","coffe"};
		String [] drinks= {"milk", "wate", "coke"};
		
		String [] mergedArray = new String [refresh.length+drinks.length];
		
		for(int i =0;i<refresh.length;i++) {
			mergedArray[i]=refresh[i];
		}
		for(int i=0; i<drinks.length;i++) {
			mergedArray[refresh.length+1]=drinks[i];
		}
		System.out.println(Arrays.toString(mergedArray));
	}
}
