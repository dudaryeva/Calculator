package Calculator;

public final class CalcMethods {

	public final static double PI = 3.141592653;
	public final static double E = 2.718281828;

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		return a / b;
	}

	public static int exponentiation(int a, int power) {
		int result = 1;
		if (power >= 0) {
			for (int i = 0; i < power; i++) {
				result *= a;
			}
		} else if (power < 0) {
			for (int i = 0; i > power; i--) {
				result /= a;
			}
		}
		return result;
	}

	public static int cube(int a) {
		return a * a * a;
	}

	public static int square(int a) {
		return a * a;
	}

	public static double circleArea(int r) {
		return PI * r * r;
	}

	public static double eIn(double power) {
		double result = 1;
		if (power >= 0) {
			for (int i = 0; i < power; i++) {
				result = result * E;
			}
		} else if (power < 0) {
			for (int i = 0; i > power; i--) {
				result = result * E;
			}

		}
		return result;
	}
}
