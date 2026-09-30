package Generic;

import java.util.*;

public class GenericExample {

	public static void main(String[] args) {
		Integer[] intarray = {1,2,3,4,5,};
		Character[] chararray = {'a', 'b', 'c', 'd'};
		Double[] doublearray = {1.1,2.2,3.3};
		
		printArray(intarray);
		printArray(chararray);
		printArray(doublearray);
		
		ArrayList<String> stringList = new ArrayList();
		stringList.add("test");
		stringList.add("iterator.....");
		printArray(stringList);
	}
	
	public static <E> void printArray(E[] array) {
		for(E el : array) {
			System.out.println(el);
		}
	}
	
	
	public static <E> void printArray(ArrayList<E> list) {
		ListIterator li = list.listIterator();
		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
		}
		
	}
}
