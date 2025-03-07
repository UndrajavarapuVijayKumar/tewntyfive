package Arrays;

public class Average {

	public static void main(String[] args) {
		int [] arry = {1,2,4,5,6,9};
		int avrg = (arry[0]+arry[1]+arry[2]+arry[3]+arry[4]+arry[5])/6;
		System.out.println(avrg);
		int sum = arry[0]+arry[1]+arry[2]+arry[3]+arry[4]+arry[5];
//		System.out.println(sum);
		int sum1 =0;
		for(int i =0;i<arry.length;i++) {
			
			sum1+= arry[i];
			
		}
		System.out.println("SUM: "+sum1);
		
		
	}

}
