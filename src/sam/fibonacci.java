package sam;

public class fibonacci {
	//0 1 1 2 3 5 8 13 21 34
	public static void main(String[] args) {
		int first =0; int second=1;
		System.out.print(first + " " + second +" ");
		for(int i=2;i<=9;i++) {
			int next =first +second;
			first=second;
			second=next;
			System.out.print(next + " ");
		}

	}

}
