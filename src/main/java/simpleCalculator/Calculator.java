package simpleCalculator;

public class Calculator {
	private int result = 0;

	public void add(int x, int y) {
		result = x + y;
	}

	public void sub(int x, int y) {
		result = x - y;
	}

	public void multi(int x, int y) {
		result = x * y;
	}

	public void div(int x, int y) {
		if(y == 0) {
			return;
		}
		result = x / y;
	}

	public int getResult() {
		return result;
	}
}
