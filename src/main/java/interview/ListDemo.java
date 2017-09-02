package interview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public ListDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String [] args) {
		List <String>list=Arrays.asList();
		
		list.add("test");
		list.add("mother");
		list.add("father");
		
		Iterator it=list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
