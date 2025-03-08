package concepts2;

public class Exampls implements Interface_main,interface2{

	@Override
	public void show_A() {
		// TODO Auto-generated method stub
		System.out.println("show a method from interface");
	}

	@Override
	public void show_B() {
		// TODO Auto-generated method stub
		System.out.println("show b method from interface");
	}

	public static void main(String[] args) {
		Exampls e = new Exampls();
		e.show_A();
		e.show_B();
		e.show_default();
		e.show();
	}
}
