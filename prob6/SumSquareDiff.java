public class SumSquareDiff{
	// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
	public static void main(String[] args) {
		System.out.println(sqOfSum(100) - sumOfSq(100));
	}

	static int sqOfSum(int n){
		int sum = (n*(n+1))/2;
		return (int) Math.pow(sum,2);
	}

	static int sumOfSq(int n){
		/*
		int sum = 0;
		for (int i=1;i<=n ;i++ ) {
			sum += (int)Math.pow(i,2);	//very inefficient
		}
		*/

		int sum = (n * (n+1) * (2*n+1))/6;
		return sum;
	}
}

