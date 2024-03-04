package week1.day4;

public class Occurrence {

	public static void main(String[] args) {
		String input="TestLeaf";
		int count=0;
		char find='e';
		char[] test= input.toCharArray();
		for (int i = 0; i < test.length; i++) {
			if(input.charAt(i)==find) {
				
				count=count+1;
			}
			
		}
		System.out.print(count);
	}

}
