import java.util.Date;
public class SpecialPythagoreanTriplet2{
	public static void main(String[] args) {
		long lStartTime = new Date().getTime();
		over:
		for (int c=1;c<1000 ;c++ ) {
			for (int b=1;b<c ;b++ ) {
				for (int a=1;a<b ;a++ ) {
					if ((a+b+c == 1000) & (a*a + b*b == c*c)) {
						System.out.println(a*b*c);
						break over;			
					}		
				}
			}
		}
		long lEndTime = new Date().getTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed milliseconds: " + difference);
	}
}