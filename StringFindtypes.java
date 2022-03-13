package week3day1.Assignments;

public class StringFindtypes {

	public static void main(String[] args) {
		
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		
		int  letter = 0, space = 0, num = 0, specialChar = 0;

	
		char[] ch3=test.toCharArray();

		for(int i=0;i<ch3.length;i++) {
			
			if(Character.isLetter(ch3[i])) {
				letter++;
			}
			
			else if(Character.isDigit(ch3[i])) {
				num++;
			}
			
			else if(Character.isSpaceChar(ch3[i])) {
				space++;
			}
			
			else {
				specialChar++;
			}
		}

		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}