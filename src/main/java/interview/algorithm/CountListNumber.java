package interview.algorithm;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CountListNumber {
	@SuppressWarnings("rawtypes")
	List list=new ArrayList();
	@SuppressWarnings("rawtypes")
	Set set=new HashSet();
	HashMap<String,Object> data=new HashMap<String,Object>();
	
	public static void main(String [] args) {
		List<String>list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("3");
		list.add("3");
		list.add("3");
		
		//方法1 通过Collections.frequency
		System.out.println("##Print list count with Collections:");
		Set<String>set=new HashSet<String>(list);
		for (String tmp:set) {
			System.out.println("key="+tmp+" and value="+Collections.frequency(list, tmp));
		}
		
		//方法2 通过Map统计
		System.out.println("##Print list count with HashMap:");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : list) {
			Integer count = (Integer) map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}		
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}
	}
}
