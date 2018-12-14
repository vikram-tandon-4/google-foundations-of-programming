import java.util.ArrayList;

public class SumNumbers {

	public static void main(String[] args) {

		System.out.println(sumNumbers("aa11b33"));
		
	}
	
	public static int sumNumbers(String str) {
		  
		  int sum =0;
		  String number= "";
		  ArrayList<String> extractedNumbers = new ArrayList<String>();
		  
		  for(int i = 0; i< str.length(); i++){
		    int ascii = (int)str.charAt(i);
		    if(ascii <=57 && ascii >= 48){
		      number = number+ (String.valueOf(str.charAt(i)));
		     
		      if(i == str.length()-1) {
		    	  if(!number.equals("")){
				        extractedNumbers.add(number);
				      }  
		      }
		    }else{
		      if(!number.equals("")){
		        extractedNumbers.add(number);
		      }
		      number ="";
		    }
		  }
		    for(String num : extractedNumbers){
		      sum += Integer.parseInt(num);
		    }
		    
		  return sum;
		}

}
