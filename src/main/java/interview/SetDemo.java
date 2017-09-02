package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public SetDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main (String []args) {
		//set是一个不包含重复元素的collection
		Set set=new HashSet();
		set.add(1);
		set.add("abc");
		set.add("abc");
		System.out.println(set.size());
		
		//在set中加入list，去除重复元素
		List list = new ArrayList();
		list.add("abc");
		list.add("def");
		set.add(list);
		System.out.println(set.size());
		
		Iterator iter=set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
}
