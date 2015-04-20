import java.util.Date;

public class SummationOfPrimes3{
	// Using Eratosthenes Sieve Prime
	public static void main(String[] args) {
		long lStartTime = new Date().getTime();
		int upperBound = 2000000;
		int upperBoundSqrt = (int) Math.sqrt(upperBound);
		boolean[] isComposite = new boolean[upperBound+1];
		long sum = 0;
		for (int i = 2;i <=upperBoundSqrt+1 ;i++ ) {
			if (!isComposite[i]) {
				sum+=i;
				for (int k = i*i;k<=upperBound ;k+=i ) {
					isComposite[k] = true;
				}
			}
		}

		for (int i = upperBoundSqrt+1;i <=upperBound ;i++ ) {
			if (!isComposite[i]) {
				sum+=i;
			}
		}
		System.out.println(sum);
		long lEndTime = new Date().getTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed milliseconds: " + difference);
	}
}