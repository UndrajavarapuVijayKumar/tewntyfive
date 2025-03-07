package Arrays;

public class MaxNoInArray {

	public static void main(String[] args) {
		int [] a = {1,2,4,52,12,532,123};
		int max =a[0];
		for(int i :a) {
			System.out.print(i+" ");
			if(i>max) {
				max=i;
			}
		}
		System.out.println("\n"+"Maximum number in an array: "+max);
	}

}
