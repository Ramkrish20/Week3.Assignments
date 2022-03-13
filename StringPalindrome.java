package week3day1.Assignments;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("----------------------palindrome----------------------------");
		
				String s1 = "madam";
				 
				 
				String rev="";
	
				for(int i=s1.length()-1;i>=0;i--) {
	
					rev=rev+s1.charAt(i);
				}
				  
				 
				System.out.println("reverse string is "+rev+" and original String is "+s1);
				 if(rev.equalsIgnoreCase(s1)) {
					 System.out.println("palindrome");
				 }
				 else {
					 System.out.println("not a palindrome");
				 }
				 
	}

}