/*
 Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
 while the other is "far", differing from both other values by 2 or more.
 Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) => true
closeFar(1, 2, 3) => false
closeFar(4, 1, 3) => true
 */
public class CloseFar {

	public static void main(String[] args) {
		System.out.print(closeFar(1, 2, 3));
	}
	
		public static boolean closeFar(int a, int b, int c) {
			  
			  if((Math.abs(a-b)<2 && Math.abs(a-c)>=2  && Math.abs(b-c)>=2)
			  || (Math.abs(a-c)<2 && Math.abs(a-b)>=2  && Math.abs(b-c)>=2)){
			 return true;
			  }

			  return false;
			}

}
