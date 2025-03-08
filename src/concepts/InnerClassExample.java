package concepts;

public class InnerClassExample {
	private int i =10;
	
	public static void main(String[] args) {
		System.out.println("main!");
		InnerClassExample ice = new InnerClassExample();
		InnerClassExample.inner in = ice.new inner();
		in.displa();
		
	}
	public class inner{
		void displa() {
			System.out.println("inner class!");
		}
	}

}
