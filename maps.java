package collections;

import java.util.*;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;
import java.lang.*;

class Maps1 {
	void hashmap() {
		HashMap hm = new HashMap<>();
		hm.put(1, "Dhileepan");
		hm.put(2, "Chinnaraj");
		hm.put(3, "Vijay");
		hm.put(4, "sdgfsr");
		hm.put(4, "safsef"); // duplicate keys not printed
		hm.put(5, "saa");
		hm.put(6, "saa"); // duplicate values accepted
		
		HashMap hm1=new HashMap<>();
		hm1.putAll(hm);
		System.out.println("hm1 :"+hm1);
		
		
//		for(Map.Entry m=hm.entrySet())
//		{
//			System.out.println(m);
//		}

		// entry
		System.out.println(hm);

		// keys
		System.out.println(hm.keySet());

		// values
		System.out.println(hm.values());

		// entry set
		Set sm = hm.entrySet();
		System.out.println(sm);

		// iterate with entry set variable
		Iterator i = sm.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// 2nd key removed
		hm.remove(2);

		Iterator im = sm.iterator();
		while (im.hasNext()) {
			System.out.println(im.next());
		}

		Iterator ims = sm.iterator();
		while (ims.hasNext()) {
			Map.Entry m = (Entry) ims.next();
			if (m.getKey().equals(3))
				m.setValue("worked");
			System.out.println(m);
		}

		System.out.println(hm.containsKey(4));  // check key contained or not
		System.out.println(hm.containsValue("Dhileepan")); // check value contained or not
	
	
		//if you use tree map its printing as ascend order or sorted
		TreeMap tm=new TreeMap<>();
		tm.put(541, "ygughjk");
		tm.put(301, "iygigigh");
		tm.put(505, "sgsg");
		tm.put(1, "Zzzzzzz");
		
		System.out.println(tm);
		tm.replace(1, "yyyy"); // replace the key and values
		System.out.println(tm);
		System.out.println(tm.size()); // size of the map
		System.out.println(tm.isEmpty()); 
		tm.putIfAbsent(2, "eeee");  // insert the element
		System.out.println(tm);
		tm.replaceAll((k,v)->"llll");
		System.out.println(tm);
		
	
	
	
	}
	

}

public class maps {
	public static void main(String[] args) {
		Maps1 m = new Maps1();
		m.hashmap();
	}
}
