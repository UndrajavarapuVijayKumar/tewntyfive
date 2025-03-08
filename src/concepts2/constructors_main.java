package concepts2;

public class constructors_main {
	String name;
	int i;
		//Default
	constructors_main(){
		System.out.println("Default constructor!");
	}
		//parameterized string
	constructors_main(String name){
		this(10.5);//calling double
		this.name=name;
		System.out.println(name);
	}
		//parameterized int
	constructors_main(int i){
		this("vijay");//calling string
		this.i=i;
		System.out.println(i);
	}
		//parameterized double
	constructors_main(double x){
		this();//calling default
		System.out.println("double");
	}
	public static void main(String[] args) {
		constructors_main cm = new constructors_main(2);
		constructors_main cm2 = new constructors_main("assaa");
		
	}
}
