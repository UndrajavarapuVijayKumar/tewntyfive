package trings;

public class reverseString {

	public static void main(String[] args) {
		String s="vijay";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		System.out.println("String buffers are introduced in java 1.0"+"\n"+
		"String buffers are thread safe due to which these are slow ");
	}

}
