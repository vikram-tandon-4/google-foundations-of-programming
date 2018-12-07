/*
 Given 2 int values greater than 0, return whichever value is 
 nearest to 21 without going over. Return 0 if they both go over.


blackjack(19, 21) => 21
blackjack(21, 19) => 21
blackjack(19, 22) => 19
 */
public class BlackJack {

	public static void main(String arg[]) {
		
		System.out.print(blackjack(19, 22));
	}
	
	public static int blackjack(int a, int b) {
		  
		  int diff1 = 21 - a;
		  int diff2 = 21 - b;
		  
		  if(diff1 < 0 && diff2 < 0){
		    return 0;
		  }
		  
		  if(diff1>=0 && diff2>=0){
		  if(diff1 >= diff2){
		    return b;
		  }else if(diff2 >= diff1){
		    return a;
		  }
		  } 
		  if(diff1>=0 && diff2<0){
		    return a;
		  }else if(diff2>=0 && diff1<0){
		    return b;
		  }
		  
		  return 0;
	}
}
