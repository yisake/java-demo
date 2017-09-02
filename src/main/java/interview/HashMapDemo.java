package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	
	public  static void main (String [] args) {
		HashMap<String , Integer> map = new HashMap<String , Integer>();		
		map.put("语文", 80);
		map.put("数学", 96);
		map.put("英语", 98);
		map.isEmpty();
		
		//Map.keySet
		System.out.println("##通过Map.keySet遍历key和value");
		for (String key:map.keySet()) {
			System.out.println("key= "+ key + " and value= " + map.get(key));
		}
		
		//Map.keySet iterator
		System.out.println("##通过Map.keySet.Iterator遍历key和value");
		Iterator<String> it2=map.keySet().iterator();
		while (it2.hasNext()){
			Object key = it2.next();
			Object val = map.get(key);
			System.out.println("key= " +key+ " and value= " + val);
		}

		//推荐，尤其是容量大时 Map.entrySet
		System.out.println("##通过Map.entrySet遍历key和value");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}		
		
		//效率比较高 Map.entrySet.iterator
		System.out.println("##通过Map.entrySet.Iterator遍历key和value");
		Iterator<?> it=map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println("key= " +entry.getKey()+ " and value= " + entry.getValue());
		}
	}
}
