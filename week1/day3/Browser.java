package week1.day3;

public class Browser {

	public static void main(String[] args) {
		Browser edge= new Browser();
		edge.launchBrowser("edge");
		edge.loadurl();

	}

	public String launchBrowser(String Browsername) {
		System.out.println("Browser launched successfully");
		return Browsername;
	}
	
	public void loadurl() {
		System.out.println("Application url loaded successfully");
	}
	
}

