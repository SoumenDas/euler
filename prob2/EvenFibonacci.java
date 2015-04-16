public class EvenFibonacci{
	// Find sum of even fibonacci nos.
	public static void main(String[] args) {
		int previous_term, present_term, next_term, sum;
		previous_term = 0;
		present_term = 1;
		next_term = 1;
		sum = 0;

		while (next_term <= 4000000){
			next_term = previous_term + present_term;
			if (next_term%2 == 0) {
				sum += next_term;
			}
			previous_term = present_term;
			present_term = next_term;
		}
		System.out.println(sum);
	}
}