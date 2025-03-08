package concepts;

import concepts2.Parent;

public class inheritance extends Parent{
	inheritance(){
		super(2, "child");
	}
	void method1(){
		System.out.println("child class method is called");
	}
	public static void main(String[] args) {
		inheritance i = new inheritance();
		

	}

}
