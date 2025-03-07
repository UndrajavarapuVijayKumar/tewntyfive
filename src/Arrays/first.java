package Arrays;

public class first {

	public static void main(String[] args) {
		int[] i = {1,2,4,5,9};
		int sum = i[0]+i[1]+i[2]+i[3]+i[4];
		System.out.println(sum);
		//for loop
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		//for each loop
		for(int k:i) {
			System.out.print(k);
		}
		int m=0;
		do {
			System.out.println("do while"+"\n");
			m++;
		}
		while(m<i.length);
			System.out.print(i[m]);	
	}

}
