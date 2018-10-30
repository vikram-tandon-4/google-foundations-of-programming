/*
 Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) ==> {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) => {"m": "n"}
pairs(["man", "moon", "good", "night"]) => {"g": "d", "m": "n", "n": "t"}
 */

import java.util.HashMap;
import java.util.Map;

public class Pairs {
	
	public static void main(String arg[]) {
		
		String[] strings = {"man","moon","good","night"};
		System.out.println(pairs(strings));
	}

	public static Map<String, String> pairs(String[] strings) {
		  
		  Map<String, String> hash = new HashMap<String, String>();
		  
		  for(String str : strings){
		    hash.put(str.substring(0,1),str.substring(str.length()-1,str.length()));
		  }
		  
		  return hash;
		}
}
