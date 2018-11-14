
public class NotReplace {

	public static void main(String[] args) {
		System.out.println(notReplace("is test"));

	}
	
	public static String notReplace(String str) {
		  
		  String newStr="";
		  
		  if(str.charAt(0) == 'i' && str.charAt(1) == 's'){
		   newStr = str.replace("is ", "is not "); 
		  } else if(str.charAt(str.length()-2) == 'i' && str.charAt(str.length()-1) == 's'){
		   newStr = str.replace(" is ", " is not "); 
		  }else{
		   newStr = str.replace(" is ", " is not "); 
		  }
		  
		  return newStr;
		}

}
