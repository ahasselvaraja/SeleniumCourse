package week1.day2;

public class Isprime {

	public static void main(String[] args) {
		int n=13;
		for(int i=2;i<n-1;i++) {
            if(n % i == 0) {
                System.out.println("Not Prime Number");
                return;
            }
	}
		System.out.println("prime number");
		
	}
	
}


