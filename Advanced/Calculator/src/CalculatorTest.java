
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator x = new Calculator();
		x.setOper1(10.5);
		x.setOper("+");
		x.setOper2(5.2);
		x.performOperation();
		x.getResult();
	}

}
