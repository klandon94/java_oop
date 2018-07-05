
public class Calculator implements java.io.Serializable {
	private Double oper1;
	private Double oper2;
	private String oper;
	private Double result;
	
	public Calculator() {
		oper1 = null;
		oper2 = null;
		oper = "";
	}
	
	public Calculator(Double oper1, String oper, Double oper2) {
		this.oper1 = oper1;
		this.oper = oper;
		this.oper2 = oper2;
	}

	public Double getOper1() {
		return oper1;
	}

	public void setOper1(Double oper1) {
		this.oper1 = oper1;
	}

	public Double getOper2() {
		return oper2;
	}

	public void setOper2(Double oper2) {
		this.oper2 = oper2;
	}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public Double getResult() {
		System.out.println(result);
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}
	
	public void performOperation() {
		if (oper1 != null  && oper != "" && oper2 != null) {
			switch(oper) {
			case "+": result = oper1 + oper2;
			break;
			case "-": result = oper1 - oper2;
			break;
			default: System.out.println("Please enter a valid operator");
			break;
			}
		}
		else System.out.println("Please enter all fields");
	}
	
}
