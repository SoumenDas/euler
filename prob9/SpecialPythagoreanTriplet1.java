public class SpecialPythagoreanTriplet{
	// There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find abc
	public static void main(String[] args) {
		boolean flag = false;
		int a = 0;
		int b = 0;
		
		for (int i = 1;flag==false ; ) {
			a = i;	
			for (int j = 1;flag==false ; ) {
				b = j;
				flag = conditionMet(i,j);
				if (j<998) {
					j++;
				} else {
					break;
				}
			}
			
			if (i<998) {
				i++;
			} else {
				break;
			}

		}
		System.out.println("a: " + a + " b: "+ b +" c: "+ ((int)Math.sqrt(Math.pow(a,2)+Math.pow(b,2))));
	}

	static boolean conditionMet(int a, int b){
		double squares = Math.pow(a,2)+Math.pow(b,2);
		int isPerfect = (int)Math.sqrt(squares);

		if (squares == Math.pow(isPerfect,2)){ // checks whether squares is a perfect square
			return (a + b + isPerfect) == 1000;	
		} else {
			return false;
		}
		
	}
}