/*
 * 
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) => {"a": "", "b": "candy"}
mapBully({"a": "candy"}) => {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) => {"a": "", "b": "candy", "c": "meh"}
 */
import java.util.HashMap;

public class MapBully {
	
	public static void main(String arg[]) {
		HashMap<String, String> map = new HashMap<String,String>();
		
		map.put("a", "candy");
		map.put("b", "carrot");
		map.put( "c", "meh");
		System.out.println(mapBully(map));
	}

	public static HashMap<String, String> mapBully(HashMap<String, String> map) {
		  
		  if(map.get("a") != null ){
			  map.put("b", map.get("a"));
			  map.put("a", "");
			  }
			  return map;
	}
}
