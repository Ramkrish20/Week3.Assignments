package week3day1.Assignments;

public class StringReverseEvenWords {

	public static void main(String[] args) {
		
		
			String test1 = "I am a software tester";
			

			String[] splitTotal = test1.split(" ");
		
			

			for(int i=0;i<splitTotal.length;i++) {
				if(i%2!=0) {
					String reverseEven="";
					char[] splitOdd=splitTotal[i].toCharArray();
					for(int j=splitOdd.length-1;j>=0;j--) {
						reverseEven+=splitOdd[j];
						
					}
					System.out.println(reverseEven+" ");
				}

				else {
				
					System.out.println(splitTotal[i]+" ");
					
					
				}
				
			}	
			
	}

}