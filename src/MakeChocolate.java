/*
 We want make a package of goal kilos of chocolate.
 We have small bars (1 kilo each) and big bars (5 kilos each).
 Return the number of small bars to use, assuming we always use big bars before small bars.
 Return -1 if it can't be done.


makeChocolate(4, 1, 9) => 4
makeChocolate(4, 1, 10) => -1
makeChocolate(4, 1, 7) => 2
 */
public class MakeChocolate {
	
	
	public static void main(String arg[]) {
		System.out.print(makeChocolate(1, 2, 7));
	}
	
	public static int makeChocolate(int small, int big, int goal) {
		  
	    int bricks = -1;
		  
		  if((small+ (big*5)< goal)){
		    return bricks;
		  }
		  
		  int modBig = (goal - goal%5)/5;
		  if(modBig >= big){
		    bricks = goal - big*5;
		  }else{
		    bricks = goal - modBig*5;
		  }
		  
		    if(bricks > small){
		    bricks = -1;
		  }
		  
		  return bricks;
	}

}
