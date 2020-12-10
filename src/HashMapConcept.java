import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Pratik", 1);
		hm.put("Engineer", 2);
		hm.put("Test", 3);
		hm.put("QA", 4);
		hm.put(null, 5);
		hm.put(null, 6);
		System.out.println(hm.get("Pratik"));
		
		for (Map.Entry<String, Integer> keys: hm.entrySet() ) {
			{
				System.out.println("Key: " +keys.getKey() + " " + "value" + keys.getValue());
			}
			
		}
		for(String keysdata : hm.keySet())
		{
			System.out.println(keysdata);
		}
	
		for(Integer data : hm.values())
		{
			System.out.println(data);
		}
	
		
		//Lamda
		
		hm.forEach((k , v) -> System.out.println("Keys: " + k + ", " + "Values:" + v));
		
		
	}

}
