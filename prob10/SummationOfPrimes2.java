import java.util.Date;

public class SummationOfPrimes2{
	public static void main(String[] args) {
		long lStartTime = new Date().getTime();
		long sum = 2;
		int num = 3;
		while(num <=2000000){
			if (isPrime(num)) {
				sum+=num;
			}
			num+=2;
		}
		System.out.println(sum);
		long lEndTime = new Date().getTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed milliseconds: " + difference);
	}

	static boolean isPrime(int n){
		for (int i = 3;i <= (int) Math.sqrt(n) ;i+=2 ) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
}