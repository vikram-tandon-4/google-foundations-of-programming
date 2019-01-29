
public class SmallestSubstring {
	
	
	 static String getShortestUniqueSubstring(char[] arr, String str) {
		 
		 String strOfArray = String.valueOf(arr);
		 
		 int len = arr.length;
		    int stringLength = str.length();
		    
		 if(len>stringLength){
		      return "";
		    }
		 
		 if(!checkSubString(str.substring(0, stringLength), arr)){
		      return "";
		    }
		 
		 String finalString = "";
		 boolean stringFound = false;
		 
		 int start = 0, end = 0;
		 
		while((start <= stringLength)) { 
			
			if(!stringFound) {
				if(end+1<= stringLength) {
				end++;
				}else {
					break;
				}
				if(checkSubString(str.substring(start, end), arr)){
					stringFound = true;
					if(finalString.length() > str.substring(start, end).length() || finalString.length() == 0) {
					finalString = str.substring(start, end);
					System.out.println("String found: "+finalString );
					}
				}
			}else if(stringFound) {
				System.out.println("check start++ : "+  checkSubString(str.substring(start+1, end), arr));
				if(checkSubString(str.substring(start+1, end), arr)) {
					if(start+1<stringLength) {
					start++;
					}else {
						break;
					}
					if(finalString.length() > str.substring(start, end).length()) {
					finalString = str.substring(start, end);
					System.out.println("Shortened String: "+ finalString);
					}else {
						System.out.println("older string is shorter than: "+ str.substring(start, end) );
					}
				}else {
					System.out.println("Window start and end incremented by 1 ");
					stringFound = false;
					if(start+1<stringLength && end+1< stringLength) {
					start++;
					end++;
					}else {
						break;
					}
				}
				
			}
		}
		
		System.out.println("Start: "+ start + "  end:  "+ end);
	
		    return finalString;
	 }
	 
	 static boolean checkSubString(String subStr, char[] strOfArray){
		 
		 System.out.println("String to be checked: "+subStr );
		 boolean containsAllelements = true;
		 
		 for(char c: strOfArray) {
			 if(!subStr.contains(String.valueOf(c))) {
				 System.out.println("String does not have all elements" );
				return false; 
			 }else {
				 subStr.replaceFirst(String.valueOf(c), "");
			 }
		 }
		 
		 System.out.println("String have all elements" );
		 
		 return containsAllelements;
	 }

	public static void main(String[] args) {
		
//		char[] arr = {'x','y','z'};
//		String str ="xyyzyzyx";
//		char[] arr = {'A','B','C'};
//		String str ="ADOBECODEBANC";
		
		char[] arr = {'A'};
		String str ="A";
		
		
			System.out.println("subset: "+ getShortestUniqueSubstring(arr, str));
	}

}
