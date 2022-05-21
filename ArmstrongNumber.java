package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
	int input = 155;
	int orgnumber = input;
	int sum = 0;
	
		while (input > 0) {			
			int rem = input % 10;
			sum = sum +(rem * rem* rem);			
			input = input /10;				
		}
		
			if (orgnumber == sum) {
				System.out.println(sum + " Is not a ArmstrongNumber");	
			}
			else
			{
				System.out.println(sum + " Is a ArmstrongNumber");
			}

	}

}
