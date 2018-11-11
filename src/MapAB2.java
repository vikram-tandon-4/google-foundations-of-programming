/*
 Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.


mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) => {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) => {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) => {"a": "aaa", "b": "bbb", "c": "aaa"}
 */

import java.util.HashMap;

public class MapAB2 {

	public static void main(String arg[]) {
		HashMap<String, String> map = new HashMap<String,String>();
		
		map.put("a", "aaa");
		map.put("b", "aaa");
		map.put("c", "cake");
		System.out.println(mapAB2(map));
	}
	
	public static HashMap<String, String> mapAB2(HashMap<String, String> map) {
		  
		  if(map.get("a") != null && map.get("b") != null){
		  if(map.get("a").equals(map.get("b"))){
		    map.remove("a");
		    map.remove("b");
		  }
		  }
		  return map;
		}
}
