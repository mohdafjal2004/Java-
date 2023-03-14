package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		// Initialise
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Original ArrayList "+list);

		Collections.swap(list,1,3);
		System.out.println("Modified ArrayList after swapping "+list);
	}

	

}
