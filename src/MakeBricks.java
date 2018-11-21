/*
 We want to make a row of bricks that is goal inches long.
  We have a number of small bricks (1 inch each) and big bricks (5 inches each).
   Return true if it is possible to make the goal by choosing from the given bricks.
    This is a little harder than it looks and can be done without any loops.
     See also: Introduction to MakeBricks


makeBricks(3, 1, 8) => true
makeBricks(3, 1, 9) => false
makeBricks(3, 2, 10) => true
 */
public class MakeBricks {

public static void main(String arg[]) {
		System.out.print(makeBricks(6, 1, 11));
	}

public static boolean makeBricks(int small, int big, int goal) {
	  
	  boolean bricks = false;
	  
	  if((small+ (big*5)< goal)){
	    return false;
	  }
	  
	  int modBig = (goal - goal%5)/5;
	  int remaining;
	  if(modBig >= big){
	    remaining = goal - big*5;
	  }else{
	    remaining = goal - modBig*5;
	  }
	  
	  if(remaining <= small){
	    bricks = true;
	  }
	  
	  return bricks;
	}

}
