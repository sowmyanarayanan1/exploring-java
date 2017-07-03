
public class Calculator {

	public double add(double num1, int num2) {
		double result = num1 + num2;
		return result;
	}

	public double subtract(double num1, int num2) {
		double result = num1 - num2;
		return result;
	}

	public double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}

	public double divide(double num1, int num2) {
		double result = num1 / num2;
		return result;
	}

	public double calculateAverage(float[] elements) {
		double result = elements[0];
		for (int index = 1; index < elements.length; index++) {
			result = result + elements[index];
		}
		double average = result / elements.length;
		return average;
	}
}
