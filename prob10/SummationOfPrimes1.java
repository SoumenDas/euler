import java.util.ArrayList;
import java.util.Date;

public class SummationOfPrimes1{
	//sum of all the primes below two million
	public static void main(String[] args) {
		long lStartTime = new Date().getTime();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		for(int n = 3; n<=2000000;n+=2){
			if (isPrime(prime,n)) {
				prime.add(n);
			}
		}
		printSum(prime);
		long lEndTime = new Date().getTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed milliseconds: " + difference);	
	}
	static Boolean isPrime(ArrayList<Integer> list,int i){
		for (int j=1;j<list.size() ;j++ ) {
			if (i%list.get(j)==0) {
				return false;
			}
		}
		return true;
	}
	static void printSum(ArrayList<Integer> list){
		long sum = 0;
		for (int i : list) {
			sum+=i;
		}
		System.out.println(sum);
	}
}