import java.util.Date;
public class SpecialPythagoreanTriplet3{
/* a= 2mn; b= m^2 -n^2; c= m^2 + n^2;
a + b + c = 1000;

2mn + (m^2 -n^2) + (m^2 + n^2) = 1000;
2mn + 2m^2 = 1000;
2m(m+n) = 1000;
m(m+n) = 500;

m>n;
*/
	public static void main(String[] args) {
		long lStartTime = new Date().getTime();
		outer:
		for (int m=1;m<100 ;m++ ) {
			for (int n=1;n<m ;n++ ) {
				if (m*(m+n) == 500) {
					System.out.println("a: "+(2*m*n)+" b: "+(m*m-n*n)+" c: "+(m*m+n*n));
					break outer;					
				}				
			}			
		}
		long lEndTime = new Date().getTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed milliseconds: " + difference);		
	}
}