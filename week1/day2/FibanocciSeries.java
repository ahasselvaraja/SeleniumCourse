package week1.day2;

public class FibanocciSeries {

	public static void main(String[] args) {
		int input=8;
		int fact=1;
		for (int i = 1; i <=input; i++) {
			fact=fact*i;
		}

		System.out.println(fact);
	}

}
