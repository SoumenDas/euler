import java.util.ArrayList;
import java.util.Date;

public class Prime10001{
	// What is the 10 001st prime number?
	public static void main(String[] args) {
		long lStartTime = new Date().getTime();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		int num = 3;
		int requiredPrime = 10001;
		while(prime.size()!=requiredPrime){
			if (isPrime(prime,num)) {
				prime.add(num);	
			}
			num+=2;
		}
		System.out.println(prime.get(requiredPrime-1));
		long lEndTime = new Date().getTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed milliseconds: " + difference);		
	}

	static Boolean isPrime(ArrayList<Integer> list,int i){
		for (int j=0;j<list.size() ;j++ ) {
			if (i%list.get(j)==0) {
				return false;
			}
		}
		return true;
	}
}