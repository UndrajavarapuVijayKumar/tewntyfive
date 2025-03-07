package sam;

public class ConvertCel2Far {

	double c,f;
	public static void main(String[] args) {
		ConvertCel2Far c2f = new ConvertCel2Far(30);

	}
	public ConvertCel2Far(double c) {
		this.c=c;
//		this.f=f;
		f=(c*1.8)+32;
		System.out.println("Fahrenheit value is : "+f+ " degree fahrenheit");
		
	}

	
}
