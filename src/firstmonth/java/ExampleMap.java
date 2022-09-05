package firstmonth.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExampleMap {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"java");
		map.put(2,"session");
		map.put(3,"on map");
		map.put(4,null);
		
		Set s = map.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			Map.Entry e = (map.entry)i.next();
	        System.out.println(e.getKey()+""+e.getValue());
			
		}
		for(Map.Entry m : map.entrySet())
				{
			System.out.println(m.getKey()+""+m.getValue());
				}
		
		
	}

}
