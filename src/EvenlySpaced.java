/*
 Given three ints, a b c, one of them is small, one is medium and one is large.
 Return true if the three values are evenly spaced, so the difference between 
 small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) => true
evenlySpaced(4, 6, 2) => true
evenlySpaced(4, 6, 3) => false
 */
public class EvenlySpaced {

	public static void main(String arg[]) {
		
		System.out.print(evenlySpaced(2,4,6));
	}
	
	public static boolean evenlySpaced(int a, int b, int c) {
		  
		  boolean isEvenlySpaced = false;
		  
		  int max = Math.max(a,Math.max(b,c));
		  int min = Math.min(a,Math.min(b,c));
		  int mid;
		    if ((a < b && b < c) || (c < b && b < a)) 
		       mid = b; 
		  
		    else if ((b < a && a < c) || (c < a && a < b)) 
		       mid = a; 
		  
		    else
		       mid = c; 
		       
		       if((max - mid) == (mid - min)){
		         isEvenlySpaced = true;
		       }
		  
		  return isEvenlySpaced;
		}
}
