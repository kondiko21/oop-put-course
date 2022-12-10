package lesson_3;

class IntegerComputations {
	
	int a;
	int b;
	
	IntegerComputations(int firstNumber, int secondNumber) {
		this.a = firstNumber;
		this.b = secondNumber;
	}
	
	int max() {
		return a > b ? a : b;
	}
	
	int min() {
		return a > b ? b : a;
	}
	float avg() {
		return ((float)a+(float)b)/2;
	}
}

public class main {

	public static void main(String[] args) {

		IntegerComputations intCalculator = new IntegerComputations(5, 6);
		System.out.println(Integer.toString(intCalculator.max()));
		System.out.println(Integer.toString(intCalculator.min()));
		System.out.println(Float.toString(intCalculator.avg()));
;		
	}

}
