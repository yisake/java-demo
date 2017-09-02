package interview;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main (String [ ] args)  {
		LinkedList<Integer> list=new LinkedList<Integer>();// 泛型，这ArrayList只能放int类型
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.addFirst(0);
		list.addLast(100);
		System.out.println("First element:"+list.getFirst());
		System.out.println("Last element:"+list.getLast());
		//获取子链表
		list.subList(1, 3);
		
		//删除元素
		list.remove();
		list.remove(0);
		list.removeFirst();
		list.removeLast();	
		
		//删除指定元素
		list.remove("2");
		
		//改变列表为数组
		Object[] arrayMy = list.toArray();
		
		LinkedList<Float> list2=new LinkedList<Float>();// 泛型，这ArrayList只能放Float类型
		list2.add(0.3333f);
	}
}
