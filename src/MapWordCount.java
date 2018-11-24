/*
 
The classic word-count algorithm: given an array of strings,
 return a Map<String, Integer> with a key for each different string,
 with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) => {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) => {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) => {"c": 4}
 */
import java.util.HashMap;
import java.util.Map;

public class MapWordCount {
	
	public static void main(String arg[]) {
		
		String[] strings = {"a", "b", "a", "c", "b"};
		System.out.println(wordCount(strings));
	}
	
	public static Map<String, Integer> wordCount(String[] strings) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
		  
		  for(String string : strings){
		    if(map.containsKey(string)){
		      map.put(string, map.get(string)+1);
		    }else{
		       map.put(string, 1);
		    }
		  }
		  return map;
		}
}
