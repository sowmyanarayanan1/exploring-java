
import org.junit.Assert;
import org.junit.Before;
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
		Assert.assertEquals("subtraction Result", 2, subtractionResult1, 0);
		double subtractionResult2 = calculator.subtract(3.2, 2);
		Assert.assertEquals(1.2, subtractionResult2, 0.01);
		double subtractionResult3 = calculator.subtract(2, 4);
		Assert.assertEquals(-2, subtractionResult3, 0);
		double subtractionResult4 = calculator.subtract(6 / 2, 2);
		Assert.assertEquals(1, subtractionResult4, 0);
	}

	@Test
	public void multiplyTest() {
		double multipilicationResult1 = calculator.multiply(4, 2);
		Assert.assertEquals(8, multipilicationResult1, 0);
		double multipilicationResult2 = calculator.multiply(3.2, 2);
		Assert.assertEquals(6.4, multipilicationResult2, 0);
		double multipilicationResult3 = calculator.multiply(1 / 2.0, 2);
		Assert.assertEquals(1, multipilicationResult3, 0);
	}

	@Test
	public void divisionTest() {
		double divisionResult1 = calculator.divide(4, 2);
		Assert.assertEquals(2, divisionResult1,0);
		double divisionResult2 = calculator.divide(3.2, 2);
		Assert.assertEquals(1.6, divisionResult2,0);
		double divisionResult3 = calculator.divide(1 / 2.0, 2);
		Assert.assertEquals(0.25, divisionResult3,0);
		//double divisionResult4 = calculator.divide(2, 0);
	}

	@Test
	public void averageTest() {
		Assert.fail("Not Implemented");
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
