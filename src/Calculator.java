
public class Calculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int ra = calculator.Add(4, 2);
		int rs = calculator.Sub(4, 2);
		int rm = calculator.Multiply(4, 2);
		int rd = calculator.Div(4, 2);
		System.out.println(ra + "\n" + rs + "\n" + rm + "\n" + rd);
		int elements [] = {2,4,6,8,9,10};
		System.out.println(calculator.calculateaverage(elements));
	}

	public  int Add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public  int Sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public  int Multiply(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public  int Div(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
	
	public double calculateaverage (int [] elements)
	{
		int result = elements[0];
		for (int i=0;i<elements.length;i++)
		{
			result = result + elements[i];
		}
		double average = result/elements.length;
		return average;
		}
	}

