/*
 We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
 Loop over and then return the given array of non-empty strings as follows:
 if a string matches an earlier string in the array, swap the 2 strings in the array.
 When a position in the array has been swapped, it no longer matches anything.
 Using a map, this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) => ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) => ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) => ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */
import java.util.HashMap;
import java.util.Map;

public class AllSwap {
	
	public static void main(String arg[]) {
		
		String[] strings = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
		String[] swappedStrings = allSwap(strings);
		
		for(String string : swappedStrings)
		System.out.print(string + " ");
	}
	
	public static String[] allSwap(String[] strings) {
		  
		  Map<String, Integer> map = new HashMap<String, Integer>();

		  for(int i=0; i<strings.length;i++){
		    String firstCharacter = strings[i].substring(0,1);
		    if(map.containsKey(firstCharacter)){
		      if(map.get(firstCharacter) == -1){
		        map.put(firstCharacter,i);
		      }else{
		        String temp = strings[i];
		        strings[i] = strings[map.get(firstCharacter)];
		        strings[map.get(firstCharacter)] = temp;
		        map.put(firstCharacter,-1);
		      }
		    }else{
		      map.put(firstCharacter,i);
		    }
		  }
		  
		  return strings;
		}
}
