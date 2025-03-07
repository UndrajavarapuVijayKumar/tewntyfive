package sam;

public class multiplication {
	int n;
	public static void main(String[] args) {
		multiplication m = new multiplication(7);

	}
	multiplication(int n){
		this.n=n;
		for(int i=1;i<=10;i++) {
			int j =i*n;
			System.out.println(i +"* "+n+" =" + j);
		}
	}

}
