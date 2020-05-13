package Assignment1;

public class Interest {

	public static void main (String[] args) {
		
		int principal = 10000;
		int time = 5;
		double rate = 12.5;
		
		double simpleInterest;
		
		simpleInterest = ((principal * time * rate)/ 100);
		System.out.println("The simple interst in 5 years is "+ simpleInterest);
		
	}
}
