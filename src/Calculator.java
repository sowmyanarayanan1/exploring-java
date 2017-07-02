
public class Calculator {
	public static void main(String[] args) {
		//Calculator calculator = new Calculator();

		//int additionResult = calculator.add(4, 2);
		//int subtractionResult = calculator.subtract(4, 2);
		//int multiplicationResult = calculator.multiply(4, 2);
		//double divisionResult = calculator.divide(3, 2);
		
		//System.out.println(additionResult + "\n" + subtractionResult + "\n" + multiplicationResult + "\n" + divisionResult);
		
		//int elements[] = { 2, 4, 6, 8, 9, 12 };
		//System.out.println(calculator.calculateAverage(elements));
	}

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
