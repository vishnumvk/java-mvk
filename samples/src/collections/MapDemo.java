package collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo 
{
	public static void main(String[] args)
	{
		//Map<String , String> map = new HashMap<>();
		Map<String , String> map = new Hashtable<>();
		map.put("Name", "Vishnu");
		map.put("School", "NMS");
		map.put("College", "VTU");
		map.put("Dept", "EEE");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
		{
			System.out.println(key + " " + map.get(key));
		}
		
		System.out.println(map);
	}
}
