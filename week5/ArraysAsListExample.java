package week5;

import java.util.*;

public class ArraysAsListExample {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("È«±æµ¿", "Á¤¿øÈ£", "±è´ö¼º");
		for(String name :  list1) {
			System.out.println(name);
		}
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}

	}

}
