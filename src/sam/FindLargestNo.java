package sam;

public class FindLargestNo {

	public static void main(String[] args) {
		int i =2; int j =121; int k=144;
		int[] a = {i,j,k};
		for(int b :a) {
			System.out.println(b);
			
		}
		if(i>j && i>k) {
			System.out.println("I is largest");
		}else if(j>i && j>k) {
			System.out.println("J is largest");
		}else if(k>i && k>j) {
			System.out.println("K is Largest ");
		}
	}

}
