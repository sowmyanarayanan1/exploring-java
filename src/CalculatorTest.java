
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();

	}

	@Test
	public void addTest() {
		double additionResult1 = calculator.add(4, 2);
		Assert.assertEquals("Addition Result1:", 6, additionResult1, 0);

		double additionResult2 = calculator.add(3.2, 2);
		Assert.assertEquals("Addition Result2:", 5.2, additionResult2, 0);
		// double additionResult3 = calculator.add(null,null);

	}

	@Test
	public void subtractTest() {

		double subtractionResult1 = calculator.subtract(4, 2);
		double subtractionResult2 = calculator.subtract(3.2, 2);
		double subtractionResult3 = calculator.subtract(2, 4);
		double subtractionResult4 = calculator.subtract(6 / 2, 2);
		System.out.println("Subtraction Result:" + "\n" + subtractionResult1 + "\n" + subtractionResult2 + "\n"
				+ subtractionResult3 + "\n" + subtractionResult4);
	}

	@Test
	public void multiplyTest() {
		double multipilicationResult1 = calculator.multiply(4, 2);
		double multipilicationResult2 = calculator.multiply(3.2, 2);
		double multipilicationResult3 = calculator.multiply(1 / 2.0, 2);
		System.out.println("Multiplication Result:" + "\n" + multipilicationResult1 + "\n" + multipilicationResult2
				+ "\n" + multipilicationResult3);
	}

	@Test
	public void divisionTest() {
		double divisionResult1 = calculator.divide(4, 2);
		double divisionResult2 = calculator.divide(3.2, 2);
		double divisionResult3 = calculator.divide(1 / 2.0, 2);
		double divisionResult4 = calculator.divide(2, 0);
		System.out.println("Division Result:" + "\n" + divisionResult1 + "\n" + divisionResult2 + "\n" + divisionResult3
				+ "\n" + divisionResult4);
	}

	@Test
	public void averageTest() {
		float elements1[] = { 2, 4, 6, 8, 10 };
		float elements2[] = { 1, 3, 5, 7, 1.2f };
		float elements3[] = { 1, 3, 5, 7, 1 / 2.0f };
		double averageResult1 = calculator.calculateAverage(elements1);
		double averageResult2 = calculator.calculateAverage(elements2);
		double averageResult3 = calculator.calculateAverage(elements3);
		// double averageResult4 = calculator.calculateAverage(null);
		System.out.println("average Result:" + "\n" + averageResult1 + "\n" + averageResult2 + "\n" + averageResult3);

	}

}
