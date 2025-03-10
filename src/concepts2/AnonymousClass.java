package concepts2;

public class AnonymousClass {
	public static void main(String[] args) {
		class2 c2 = new class2() {
			public void print() {
			System.out.println("printing method from class2 updated one -overriding!");
		}};
//		System.out.println("asd");
		c2.print();
	}
}

class class1{
	public void show() {
 		System.out.println("Show method from class1");
	}
	public void print() {
		System.out.println("Print method from class1");
	}
}
class class2 extends class1{
	class2(){
		System.out.println("default class2 constructor");
	}
	/*
	 * public void print() {
	 * System.out.println("printing method from class2 updated one -overriding!"); }
	 */
}