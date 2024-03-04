package week1.day4;

public class StringReverse {

	public static void main(String[] args) {
		String Companyname="Testleaf";
		char[] CharacterArray= Companyname.toCharArray();
		String reversed="";

		for(int i=CharacterArray.length-1;i>=0;i--)
		{
			reversed=reversed+CharacterArray[i];

		}
		System.out.println(reversed);


	}

}
