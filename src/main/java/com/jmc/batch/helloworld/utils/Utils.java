package com.jmc.batch.helloworld.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {

	public static List<Integer> getPrimaryNumbersFromRange(int startNumber, int endNumber) {

		List<Integer> primaryNumbersList = new ArrayList<>();

		for (int i = startNumber; i <= endNumber; i++) {
			if (isPrimary(i)) {
				primaryNumbersList.add(i);
			}
		}
		
		return primaryNumbersList;

	}

	private static boolean isPrimary(int n) {

		for(int i=2;i <=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void displayNumbersFromList(List<Integer> numbers) {
		for(int i=0; i <numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
	}
}
