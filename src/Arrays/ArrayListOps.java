package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListOps {
	public static void main(String[] args) {
		Integer[] arr = {12,23,1212,43,54,67,74,2};
		List<Integer>list = new ArrayList<>(Arrays.asList(arr));
		System.out.println("Size of a list : " +list.size());
		Collections.sort(list);
		//You're getting an error because Collections.sort(list) does not return anything (void),
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		list.add(2, 1994);
		System.out.println(list.toString());
		System.out.println(list.get(2));
	}
}
