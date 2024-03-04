package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int rem,input=12321;
		int output=0;
		
		for(int i=input;i>0;i=i/10)
		{
			rem=i%10;  
			output=output*10+rem;  
			
		}
		if(input==output) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");


	}

}
