package arrays; 

import java.util.Arrays;
import java.util.Scanner;

public class ArrayofObjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Array of objects
		String[] str = new String[4];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		System.out.println("Original Output array- "+Arrays.toString(str));
		
		
	}

}
