public class Multiple3and5 {
	//Find sum of all multiples of 3 & 5 below 1000
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1;i<1000 ;i++ ) {
			if (i%3 == 0 | i%5 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}