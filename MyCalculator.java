package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {

		Calculator myCalculator = new Calculator();
		// Call Add Method
		System.out.println("Sum Value Is: " + myCalculator.add(5, 4, 4));
		// Call Sub Method
		System.out.println("Subtraction Value Is: " + myCalculator.sub(7, 4));
		// Call Multiplication Method
		System.out.println("Multiplication Value Is: " + myCalculator.mul(6.5, 6.5));
		// Call Division Method
		System.out.println("Division Value Is: " + myCalculator.div(10.5f, 2));

	}

}
