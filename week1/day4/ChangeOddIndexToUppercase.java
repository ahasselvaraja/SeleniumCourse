package week1.day4;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char [] Chararray=test.toCharArray();
		for(int i=0;i<Chararray.length;i=i+1) {
			char c= Chararray[i];
			if(i%2!=0) {
			c= Character.toUpperCase(c);	
		}
	System.out.print(c);
		}

}
	}
