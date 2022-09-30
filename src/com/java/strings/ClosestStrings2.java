package com.java.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestStrings2 {

		public static int shortestDistance(ArrayList<String> s, String word1, String word2) {
			int alist_size = s.size();
			
			List<Integer> matchingIndices1 = new ArrayList<Integer>();
			for(int i = 0; i < alist_size; i++) {
				String element1 = s.get(i);
				
				if(word1.equals(element1)) {
					matchingIndices1.add(i);
				}
			}
			
			List<Integer> matchingIndices2 = new ArrayList<Integer>();
			for(int j = 0; j < alist_size; j++) {
				String element2 = s.get(j);
				
				if(word2.equals(element2)) {
					matchingIndices2.add(j);
				}
			}
			
			int diff = alist_size;
			int temp = 0;
			
			for(int x = 0; x < matchingIndices2.size(); x++) {
				for(int y = 0; y < matchingIndices1.size(); y++) {
					if((matchingIndices2.get(x) - matchingIndices1.get(y)) > 0) {
						temp = matchingIndices2.get(x) - matchingIndices1.get(y);
						
						if(temp < diff)
							diff = temp;
					}
				}
			}
			
			return diff;
		}

		public static void main(String[] args) {
			String[] str = {"the", "quick", "brown", "fox", "quick"};
			String word1 = "the";
			String word2 = "fox";
			
			ArrayList<String> list = new ArrayList<String>();
			Collections.addAll(list, str);
			
			int getDistance = shortestDistance(list, word1, word2);
			
			System.out.println(getDistance);
		}
}