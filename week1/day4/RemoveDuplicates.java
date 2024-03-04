package week1.day4;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		char[] arr=text.toCharArray();
		int count=0;
		String[] word=text.split(" ");
		for (int i = 0; i < word.length; i++) {
			for (int j = i+1; j < word.length; j++) {
				if(word[i].equals(word[j])) {
					count=count+1;
				}
				if (count!=0) {
					for (int k = i; k < word.length; k++) {
						
					}
				}
			}
			
		}

	}

}
