/*
 Write a function that replaces the words in `raw` with the words in `code_words` 
 such that the first occurrence of each word in `raw` is assigned the first unassigned word in `code_words`.


encoder(["a"], ["1", "2", "3", "4"]) => ["1"]
encoder(["a", "b"], ["1", "2", "3", "4"]) => ["1", "2"]
encoder(["a", "b", "a"], ["1", "2", "3", "4"]) => ["1", "2", "1"]
 */

import java.util.HashMap;
import java.util.Map;

public class Encoder {
	
	public static void main(String arg[]) {
		
		String[] raw = {"a", "b", "a"};
		String[] words = {"1", "2", "3", "4"};
		String[] swappedStrings = encoder(raw, words);
		
		for(String string : swappedStrings)
		System.out.print(string + " ");
	}

	
	public static String[] encoder(String[] raw, String[] code_words) {
		  
		  String[] finalArray = new String[raw.length];
		  int current = 0;
		  
		  Map<String, String> map = new HashMap<String, String>();
		  
		  for(int i = 0; i < raw.length; i++){
			  
		    String rawString = raw[i]; 
		    
		    if(map.containsKey(rawString)){
		      finalArray[current] = map.get(rawString);
		      current++;
		    }else{
		      map.put(rawString, code_words[i]);
		      finalArray[current] = code_words[i];
		      current++;
		    }
		  }
		  
		  return finalArray;
		}
}
