package IteratorAndListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Driver {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(8);
		
		for(Integer number:list)
			System.out.print(number + " ");
		
		Iterator<Integer> it = list.iterator();
		int number = 3;
		int position=0;
		int entry;
		while(it.hasNext()) {
			entry = it.next(); 
			if(number<=entry) {
				list.add(position, number);
				break;
			}
			position++;
		}
		
		System.out.println();
		
		for(Integer number2:list)
			System.out.print(number2 + " ");

		System.out.println();
		
		ListIterator<Integer> it2 = list.listIterator(list.size());
		while(it2.hasPrevious()) {
			System.out.print(it2.previous()+" ");	
		}

	}

}
