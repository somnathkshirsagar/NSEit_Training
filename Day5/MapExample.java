package Day5;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
	
		Map<String,String> states1 = new HashMap();
		states1.put("MH", "Maharastra");
		states1.put("KA", "Karnataka");
		states1.put("TS", "Telengana");
		states1.put("TN", "TamilNadu");
		System.out.println(states1);
		
		
		states1.putIfAbsent("TN", "Tamilnadu"); //this method inserts object if there is no object at that place
		System.out.println(states1);
		
		Map<String,String> states2 = new HashMap();
		states2.put("DL", "Delhi");
		states2.put("KL", "Kerala");
		states2.put("WB", "WestBengal");
		states2.put("OR", "Orrisa");
		
		states1.putAll(states2); // inserts the map in other map
		System.out.println(states1);
		
		states1.remove("OR","Orrisa");// removes the object
		System.out.println(states1);

		System.out.println("The keys are: "+ states1.keySet());// returns the key
		System.out.println("The values are: "+ states1.values()); //returns the value
		if(states1.containsKey("KA")) // checks whether the key is in map or not
		System.out.println("KA is available...");
		else
		System.out.println("Not available");
		if(states1.containsValue("Telengana")) // checks whether the value is in map or not
		System.out.println("Telengana is available...");
		else
		System.out.println("Not available");
		System.out.println("The value for given key Ts is :"+states1.get("TS"));
		System.out.println(states1.size()); // returns int of map size
	}
}
