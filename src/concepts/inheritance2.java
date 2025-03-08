package concepts;

public class inheritance2 extends inheritance{
	inheritance2(){
		super();
		System.out.println("Grand Child Class!");
	}
	public static void main(String[] args) {
		inheritance2 i2=new inheritance2();
		i2.method1();
		
	}
}
