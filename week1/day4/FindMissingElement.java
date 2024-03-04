package week1.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int [] Input = {1, 4,3,2,8, 6, 7};
		Arrays.sort(Input);
		for (int i = 0; i<Input.length-1; i++) {
			if(i!=Input[i]) {
				System.out.println(i);
			}
			
		}
	}

}
