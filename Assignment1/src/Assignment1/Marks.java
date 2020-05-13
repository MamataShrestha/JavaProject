package Assignment1;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double subject1 = 90;
		double subject2 = 88.5;
		double subject3 = 100;
		double subject4 = 66;
		double subject5 = 72.5;
		
		double percentage;
		double total;
		double average;
		
		total = (subject1 + subject2 + subject3 + subject4 + subject5);
		System.out.println("The total marks obtained is " + total);
		
		average = (total / 5);
		System.out.println("The average is " + average);
		
		percentage = (total / 500) * 100;
		System.out.println("The percentage is "+ percentage +"%");
	}

}
