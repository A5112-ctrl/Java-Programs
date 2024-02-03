package com.edu;

import java.util.HashMap;
import java.util.Map;

public class Source {
	public static Map<Character, Integer> countChars(char arr[]) {

		// {'a','f','c','d','a','c'};
		Map<Character, Integer> charHashMap = new HashMap<Character, Integer>();
		for (char c : arr) {// a
			// System.out.println(c);
			if (charHashMap.containsKey(c)) {
				charHashMap.put(c, charHashMap.get(c) + 1);
				// increment count
			} else {
				// put the char and value as
				// char not exists in hashmap
				charHashMap.put(c, 1);// {a=1}
			}
		}
		return charHashMap;

	}

	public static void main(String[] args) {
		char[] arr = { 'a', 'f', 'c', 'd', 'a', 'c' };
		Map<Character, Integer> cnt = countChars(arr);
		System.out.println(cnt);
	}
}
