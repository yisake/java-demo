package interview;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main (String [] args) {		
		//澧炲姞鍏冪礌
		ArrayList<String> list = new ArrayList<String>();
		list.add("first");
		list.add(1, "2");
		list.add(1, "3");
		System.out.println("##Add ele:"+list);
		
		//鍒犻櫎鍏冪礌
		list.remove(0);
		System.out.println("##Remove ele:"+list);
		
		/**閬嶅巻list鏂规硶*/
		//鏂规硶涓�
		Iterator<String> it1 = list.iterator();
		System.out.println("##Start to list:");
		while (it1.hasNext() ) {
			System.out.println(it1.next());
		}
		
		//鏂规硶浜�
		for (Iterator<String> it2=list.iterator();it2.hasNext();) {
			System.out.println(it2.next());
		}
		
		//鏂规硶涓�
		for (String tmp:list) {
			System.out.println(tmp);
		}
		
		//鏂规硶鍥�
		for (int i=0; i<list.size(); i++) {
			String name = list.get(i);
			System.out.println(name);
		}
		
		//閬嶅巻闈㈣瘯棰�
		//ArrayList <String> list3= new ArrayList<String>();
		//ArrayList <String> list4= new ArrayList<String>();
	}
}
