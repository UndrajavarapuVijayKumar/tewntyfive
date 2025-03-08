package concepts2;

interface Interface_main {
	void show_A();
	void show_B();
	static void show_Static() {
		System.out.println("static method inside interface");
	}
	default void show_default() {
		System.out.println("Default method inside interface!");
	}
}
