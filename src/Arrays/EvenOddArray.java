package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvenOddArray {

	public static void main(String[] args) {
		Integer[] arr = {12, 23, 1212, 43, 54, 67, 74, 2};
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		List<Integer> evens =new ArrayList<>();
		List<Integer> odds =new ArrayList<>();
		
		for(int num:list) {
			if(num%2==0) {
				
				evens.add(num);
			}else {
				odds.add(num);
			}
		}
		list.clear();
		System.out.println("list after clearing : "+list);
		list.addAll(evens);
		Collections.sort(list);
		System.out.println("list after adding evens : "+list);
		list.addAll(odds);
		Collections.sort(list);
		System.out.println("list after adding even and odds : "+list);
//		Collections.sort(list);
		System.out.println("Sorted List: "+list);
	}

}
