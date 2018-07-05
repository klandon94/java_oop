import java.util.ArrayList;

public class Calculator2 implements java.io.Serializable {
	private ArrayList<Double> operands;
	private ArrayList<String> operators;
	private Double result;
	
	public Calculator2() {
		operands = new ArrayList<Double>();
		operators = new ArrayList<String>();
	}
	
	
	public ArrayList<Double> getOperands() {
		return operands;
	}


	public void setOperands(ArrayList<Double> operands) {
		this.operands = operands;
	}


	public ArrayList<String> getOperators() {
		return operators;
	}


	public void setOperaters(ArrayList<String> operators) {
		this.operators = operators;
	}


	public void performOperation(Double d) {
		operands.add(d);
	}
	
	public void performOperation(String s) {
		Double first = operands.get(0);
		if (s != "=") operators.add(s);
		else {
			for (int i=0; i<operators.size(); i++) {
				switch(operators.get(i)) {
					case "+": 
						if (i+1 < operators.size()) {
							int x = i+1;
							while(x < operators.size()) {
								switch(operators.get(x)) {
									case "*": operands.set(x, operands.get(x) * operands.get(x+1));
									operators.remove(x);
									operands.remove(x+1);
									x--;
									break;
									case "/": operands.set(x, operands.get(x) / operands.get(x+1));
									operators.remove(x);
									operands.remove(x+1);
									x--;
									break;
								}
								x++;
							}						
						}
						first += operands.get(i+1);
						break;
					case "-": 
						if (i+1 < operators.size()) {
							int x = i+1;
							while(x < operators.size()) {
								switch(operators.get(x)) {
									case "*": operands.set(x, operands.get(x) * operands.get(x+1));
									operators.remove(x);
									operands.remove(x+1);
									x--;
									break;
									case "/": operands.set(x, operands.get(x) / operands.get(x+1));
									operators.remove(x);
									operands.remove(x+1);
									x--;
									break;
								}
								x++;
							}						
						}
						first -= operands.get(i+1);
						break;
					case "*":
						first *= operands.get(i+1);
						break;
					case "/":
						first /= operands.get(i+1);
						break;	
				}
			}
		}
		result = first;
	}
	
	public Double getResults() {
		System.out.println(result);
		return result;
	}
}
	