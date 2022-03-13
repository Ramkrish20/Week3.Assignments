package week3day1.Assignments;

public class StringCharOccurence {

	public static void main(String[] args) {
		
		
		
		String str = "welcome to chennai";

		
		int count=0;
		
		char[] ch=str.toCharArray();

		int length = ch.length;
 
		for(int i=0;i<length;i++) {
	
			if(ch[i]=='e') {
	
				count++;
			}
		}
		
		System.out.println("Number of times the character 'e' occurs in the string is "+count);
	}

}