public class SmallestMultiple {
	/* 
		smallest positive number that is evenly divisible by all of the numbers 
		from 1 to 20
	*/
	public static void main(String[] args) {
		 int noOf2, noOf3, noOf5, noOf7, noOf11, noOf13, noOf17,noOf19,
			count2, count3, count5, count7,count11, count13,count17,count19,number;
		noOf2 = noOf3 = noOf5 = noOf7 = noOf11 = noOf13 = noOf17 = noOf19
			  = count2 = count3 = count5 = count7 = count11 = count13
			  = count17 = count19 = number = 0;

		for (int i = 2; i<=20; i++) {
			number = i;
			count2 = count3 = count5 = count7 = count11 = count13
			  = count17 = count19 = 0;
			
			while (number%2 == 0) {
				count2 ++ ;
				number/=2;				
			}
			if (count2 > noOf2) {
				noOf2 = count2;
			}
			while (number%3 == 0){
				count3 ++;
				number/=3;
			}
			if (count3 > noOf3) {
				noOf3 = count3;
			}
			while (number%5 == 0){
				count5 ++;
				number/=5;
			}
			if (count5 > noOf5) {
				noOf5 = count5;
			}
			while (number%7 == 0){
				count7 ++;
				number/=7;
			}
			if (count7 > noOf7) {
				noOf7 = count7;
			}
			while (number%11 == 0){
				count11 ++;
				number/=11;
			}
			if (count11 > noOf11) {
				noOf11 = count11;
			}
			while (number%13 == 0){
				count13++;
				number/=13;
			}
			if (count13 > noOf13) {
				noOf13 = count13;
			}
			while (number%17 == 0){
				count17++;
				number/=17;
			}
			if (count17 > noOf17) {
				noOf17 = count17;
			}
			while (number%19 == 0){
				count19++;
				number/=19;
			}		
			if (count19 > noOf19) {
				noOf19 = count19;
			}
			System.out.println("Iteration: "+ i +
						   " noOf2: "+noOf2+
						   " noOf3: "+noOf3+
						   " noOf5: "+noOf5+
						   " noOf7: "+noOf7+
						   " noOf11: "+noOf11+
						   " noOf13: "+noOf13+
						   " noOf17: "+noOf17+
						   " noOf19: "+noOf19);
		}
		System.out.println((int)Math.pow(2,noOf2)*Math.pow(3,noOf3)*Math.pow(5,noOf5)*
			Math.pow(7,noOf7)*Math.pow(11,noOf11)*Math.pow(13,noOf13)*
			Math.pow(17,noOf17)*Math.pow(19,noOf19));	
	}
}