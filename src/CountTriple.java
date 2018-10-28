/*
 
We'll say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string. The triples may overlap.


countTriple("abcXXXabc") ==> 1
countTriple("xxxabyyyycd") ==> 3
countTriple("a") ==> 0
 */
public class CountTriple {

	public static void main(String[] args) {
		System.out.print(countTriple("abYYYabXXXXXab"));
	}

	public static int countTriple(String str) {
		int triplet = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			boolean checkTriplet = true;
			for (int j = i + 1; j < i + 3; j++) {
				if (str.charAt(j) != str.charAt(i)) {
					checkTriplet = false;
				}
			}
			if (checkTriplet) {
				triplet++;
			}
		}
		return triplet;
	}
}
