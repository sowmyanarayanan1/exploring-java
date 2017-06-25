
public class Calculator {
	public static void main(String[] args) {
		int ra = Add(4, 2);
		int rs = Sub(4, 2);
		int rm = Multiply(4, 2);
		int rd = Div(4, 2);
		System.out.println(ra + "\n" + rs + "\n" + rm + "\n" + rd);
	}

	public static int Add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int Sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public static int Multiply(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public static int Div(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
}
