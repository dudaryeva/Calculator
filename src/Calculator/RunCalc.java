package Calculator;

import static Calculator.CalcMethods.*;

public class RunCalc {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		String operation = args[0];
		try {

			switch (operation) {
			case "add":
				System.out.println(add(a, b));
				break;
			case "sub":
				System.out.println(sub(a, b));
				break;
			case "myltiply":
				System.out.println(multiply(a, b));
				break;
			case "divide":
				System.out.println(divide(a, b));
				break;
			case "exponentiation":
				System.out.println(exponentiation(a, b));
				break;
			case "cube":
				System.out.println(cube(a));
				break;
			case "square":
				System.out.println(square(b));
				break;
			case "circleArea":
				System.out.println(circleArea(b));
				break;
			case "eIn":
				System.out.println(eIn(a));
				break;
			case "help":
				System.out.println("List of operations:");
				System.out.println("Addition. Example: add 5 2");
				System.out.println("Subtraction. Example: sub 5 2");
				System.out.println("Multiplying. Example: multiply 5 2");
				System.out.println("Dividion. Example: divide 5 2");
				System.out.println("Exponentiation. Example: exponentiation 5 2");
				System.out.println("Number in cube. Example: cube 5");
				System.out.println("Number in square. Example: square 2");
				System.out.println("Circle area. Example: circleArea 5");
				System.out.println("E in radical. Example: eIn 2");
				break;
			default:
				System.out.println("Choose operation.");
				break;

			}

		} catch (NumberFormatException e) {
			System.out.println("Please enter integer numbers");
		}

	}

}
