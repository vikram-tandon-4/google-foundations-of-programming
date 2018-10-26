/*
 * Modify and return the given map as follows: 
 * if the key "a" has a value, set the key "b" to have that same value. 
 * In all cases remove the key "c", leaving the rest of the map unchanged.


mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) => {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) => {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) => {"a": "aaa", "b": "aaa", "d": "hi"}
 */


import java.util.HashMap;
import java.util.Map;

public class MapShare {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "aaa");
		map.put("c", "meh");
		map.put("d", "hi");
		mapShare(map);
		
		System.out.println(mapShare(map));
	}
	
	public static Map<String, String> mapShare(Map<String, String> map) {
		  
		  if(!map.isEmpty()){
		    if(map.get("a")!= null){
		      map.put("b",map.get("a"));
		    }
		  }
		  map.remove("c");
		  
		  return map;
		}

}
