package interview.algorithm;

import java.util.ArrayList;
import java.util.Iterator;

public class DelDuplicate {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> newList=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("2");
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String item=it.next();
			if (newList.contains(item)) {
				
			} else {
				newList.add(item);
			}
		}
		System.out.println(newList);
	}
}
