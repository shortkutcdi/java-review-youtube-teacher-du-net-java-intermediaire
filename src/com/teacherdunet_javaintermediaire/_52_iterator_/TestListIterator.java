package com.teacherdunet_javaintermediaire._52_iterator_;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> tab = new ArrayList<Integer>();
		
		tab.add(67);
		tab.add(45);
		tab.add(34);
		tab.add(56);
		tab.add(78);
		
		// ListIterator hérite de Iterator avantage plus de possibilités (méthodes)
		ListIterator<Integer> iterator = tab.listIterator();
		while (iterator.hasNext()) {
			System.out.println((Integer) iterator.next());
		}

	}

}
