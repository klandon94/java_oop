import java.util.ArrayList;

public class Calculator2Test {

	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
		calc.performOperation(10.5);
		calc.performOperation("+");
		calc.performOperation(5.2);
		calc.performOperation("*");
		calc.performOperation(10.0);
		calc.performOperation("=");
		calc.getResults();
		
		Calculator2 calc2 = new Calculator2();
		calc2.performOperation(3.0);
		calc2.performOperation("+");
		calc2.performOperation(9.0);
		calc2.performOperation("*");
		calc2.performOperation(2.0);
		calc2.performOperation("-");
		calc2.performOperation(5.0);
		calc2.performOperation("=");
		calc2.getResults();
		
		Calculator2 calc3 = new Calculator2();
		calc3.performOperation(40.0);
		calc3.performOperation("-");
		calc3.performOperation(16.0);
		calc3.performOperation("*");
		calc3.performOperation(3.0);
		calc3.performOperation("/");
		calc3.performOperation(2.0);
		calc3.performOperation("+");
		calc3.performOperation(4.0);
		calc3.performOperation("*");
		calc3.performOperation(4.0);
		calc3.performOperation("=");
		calc3.getResults();
	}

}
