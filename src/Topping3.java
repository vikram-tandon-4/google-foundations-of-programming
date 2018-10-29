
	/*
	 
Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".


topping3({"potato": "ketchup"}) => {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) => {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) => {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
	 */

	import java.util.HashMap;

	public class Topping3 {

		
		public static void main(String arg[]) {
			HashMap<String, String> map = new HashMap<String,String>();
			
			map.put("potato", "ketchup");
			map.put("salad", "oil");
			System.out.println(topping(map));
		}

		public static HashMap<String, String> topping(HashMap<String, String> map) {
			  
			 if(map.get("potato") != null ){
				  map.put("fries", map.get("potato"));
				  }
				  
				  if(map.get("salad") != null ){
				  map.put("spinach", map.get("salad"));
				  }
				  return map;
		}
	}

