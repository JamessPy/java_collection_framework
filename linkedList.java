package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedList {
	public static void main(String[] args) {
		/*
		 * ArrayLists manage arrays internally [0][1][2][3][4][5]
		 * 
		 */
		List<Integer> arrayList = new ArrayList<Integer>();

		/*
		 * LinkedList consist of elements where each element has a reference to the
		 * previous and next element
		 */
		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	public static void doTimings(String type, List<Integer> list) {

		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();

		// Add item end of the list
		/*
		 * for(int i=0; i <1E5; i++) { list.add(i); }
		 */
		// Add item elsewhere in the list

		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}

		long end = System.currentTimeMillis();

		System.out.println("Passing time is " + (end - start) + " in the " + type);
	}
}
