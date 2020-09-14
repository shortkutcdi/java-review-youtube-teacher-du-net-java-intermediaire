package com.teacherdunet_javaintermediaire._52_iterator_;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator_Array {

	public static void main(String[] args) {
		ArrayList<Integer> tab = new ArrayList<Integer>();
		
		tab.add(67);
		tab.add(45);
		tab.add(34);
		tab.add(56);
		tab.add(78);
		
		Iterator<Integer> iterator = tab.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
