package concepts2;

public class Parent {
	int i ;
	String name;
	
	protected Parent(int i, String name){	//we need to give the modifier as protected because we are using it outside of the package
		this.i=i;
		this.name =name;
		System.out.println(i +" "+ name + " coming from Parent class default constructor!");
	}
	public static void main(String[] args) {
		Parent p = new Parent(1, "vijay");
		
	}
	
}
