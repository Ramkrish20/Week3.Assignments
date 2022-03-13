package week3.day2.Assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDulpicates {

	public static void main(String[] args) {
	

			String text = "We learn java basics as part of java sessions in java week1";
			
			String[] splitText = text.split(" ");
			
			LinkedHashSet<String> removeDup = new LinkedHashSet<String>(Arrays.asList(splitText));
			
			for(String noDup : removeDup) {
				System.out.println(noDup);
			}
			
	}
	
}