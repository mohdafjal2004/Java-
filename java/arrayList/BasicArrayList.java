package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Syntax
		ArrayList<Integer> list = new ArrayList<Integer>(10);
//		//No worry about sizes and the capacity of the input
//		list.add(67);
//		list.add(67);
//		list.add(67474575);
//		list.add(672);
//		list.add(627);
//		list.add(61756);
//		list.add(6707457);
//		list.add(647585875);
//		list.add(647585875);
//		list.add(647585875);
//		list.add(647585875);
//		list.add(647585875);
//		list.add(647585875);
//		list.add(647585875);

		// input
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}

		// Get item at any index
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));// pass index here,
			// list[index] syntax will not work here
		}

		System.out.println(list);
	}

}
