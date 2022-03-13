package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		List<Integer> sortedList = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		Collections.sort(sortedList);
		
		Set<Integer> FindDup = new HashSet<Integer>();
		
		for(Integer dup : sortedList) {
			if(!FindDup.add(dup)) {
				System.out.println(dup);
			}
			
		}
			
	}

}