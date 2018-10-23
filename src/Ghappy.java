/*
 We'll say that a lowercase 'g' in a string is "happy" 
 if there is another 'g' immediately to its left or right.
  Return true if all the g's in the given string are happy.


gHappy("xxggxx") => true
gHappy("xxgxx") => false
gHappy("xxggyygxx") => false
 */
public class Ghappy {
	
	public static void main(String[] args) {
		System.out.print(gHappy("xxgggxyg"));
	}
	
	public static boolean gHappy(String str) {
		  
		  boolean happy = true;
		  
		  if(str.length() == 1){
		     happy = false;
		     return happy;
		  } 
		  
		  for(int i=1;i< str.length();i++){
		    
		    if(str.charAt(i) == 'g'){
		      if(i == str.length()-1){
		        if(str.charAt(i-1) != 'g'){
		           happy = false;
		        break;
		        }
		      }else{
		         if(str.charAt(i-1) != 'g' && str.charAt(i+1) != 'g'){
		        happy = false;
		        break;
		      } 
		      }
		    }
		  }
		  return happy;
		}

}
