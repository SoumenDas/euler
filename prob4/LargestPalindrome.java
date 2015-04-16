import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class LargestPalindrome 
{
	// Find the largest palindrome made from the product of two 3-digit numbers
	public static void main(String[] args) {
		int product = 1;
		ArrayList <Integer> palindromeList = new ArrayList<Integer>();

		for (int i = 1; i<=100 ; i++) {
			for (int j=1 ;j<=100 ; j++ ) {
				product = (1000-i)*(1000-j);
				if (isPalindrome(product)) {
					//System.out.println(palindromeList.size());
					palindromeList.add(product);
				}
			}
		}
		Collections.sort(palindromeList);
		System.out.println(palindromeList.get(palindromeList.size()-1));
		
	}

	static Boolean isPalindrome(int s){
		String str = Integer.toString(s);
		String [] contents = str.split(""); 
		String [] reverseContents = new String[contents.length];
		for (int i=0;i<contents.length ;i++ ) {
			reverseContents[i] = contents[contents.length - 1 - i];
		}
		return Arrays.equals(contents,reverseContents);
	}
}