package com.nit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Test1 
{
	void main()
	{
//		Integer i1 = 128;
//		Integer i2 = 128;		
//		System.out.println(i1==i2);
//		System.out.println(i1.equals(i2));
		
//		 Map<Integer,String> map = new HashMap<>();
//			map.put(128,"Ampt");
//			map.put(new Integer(128),"Hyd");
//			System.out.println(map.size());
		
//		HashMap hash = new HashMap<>();
//		hash.put("nit", 500);
//		hash.put("info", 644);
//		hash.put("tech", "google");
//		System.out.println(hash.get("tech"));
//		System.out.println(hash.get("google"));
//		System.out.println(hash.getOrDefault("nit", "Technology"));
//		System.out.println(hash.get("info"));
		
//		HashMap participant = new HashMap();
//        participant.put(1 + 1, "Dhoni");
//        participant.put(1 + 1, "Kohli");
//        participant.put(2 + 1, "Rohit");
//        Set set = participant.entrySet();
//        Iterator itr = set.iterator();
//        while (itr.hasNext()) {
//            Map.Entry m = (Entry) itr.next();
//            System.out.print(m.getKey() + " " + m.getValue()+" ");
        NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
        map.firstKey();
        System.out.println(map.size());
   
        


	    
	}
}

