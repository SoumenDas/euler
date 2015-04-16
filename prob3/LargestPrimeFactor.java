import java.math.BigInteger;
public class LargestPrimeFactor{
	public static void main(String[] args) {
		BigInteger number = new BigInteger("600851475143") ;
		BigInteger lPrimeFactor = BigInteger.ONE;
		BigInteger i = new BigInteger("2");

		for (; isLessThan(i,number) ;i = increment(i)) 
		{
			while(number.mod(i) == BigInteger.ZERO)
			{
				number = number.divide(i);
				if (i.compareTo(lPrimeFactor) == 1) {
					lPrimeFactor = i;
				}
			}
			
			//System.out.println(lPrimeFactor);
		}
		System.out.println(lPrimeFactor);
	}
	static Boolean isLessThan(BigInteger i, BigInteger n){
		int val = n.compareTo(i);
		if (val == -1) {
			return false;
		} else {
			return true;
		}
	}
	static BigInteger increment (BigInteger i){
		return i.add(BigInteger.ONE);
	}
}