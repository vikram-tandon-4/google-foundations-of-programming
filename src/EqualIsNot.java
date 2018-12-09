/*
 
Given a string, return true 
if the number of appearances of "is" anywhere in the string
 is equal to the number of appearances of "not" anywhere in the string (case sensitive).


equalIsNot("This is not") ==> false
equalIsNot("This is notnot") ==> true
equalIsNot("noisxxnotyynotxisi") ==> true
 */
public class EqualIsNot {

	public static void main(String[] args) {
		System.out.print(equalIsNot("xxxyyyzzzintint"));
	}
	
	public static boolean equalIsNot(String str) {
		  
		  int is = (str.length() - str.replace("is","").length())/2;
		  int not = (str.length() - str.replace("not","").length())/3;
		  
		  if(is == not){
		    return true;
		  }else{
		    return false;
		  }
		}
}
