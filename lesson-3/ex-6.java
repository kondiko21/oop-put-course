package lesson3_2;

interface Number {
	double doubleValue() throws Exception;
}

class Logarithm implements Number {

private double base, argument;

@Override
public double doubleValue() throws Exception {
	
 if(argument < 0 || argument == 1 || base < 0)	 {
	 throw new Exception("Incorrect arguments base or argument");
 }
	
 return Math.log(this.argument) / Math.log(this.base);
}

public Logarithm(double inputBase, double inputArgument) {
 this.base = inputBase;
 this.argument = inputArgument;
}
}

public class Main {

	public static void main(String[] args) {
		
		
		Logarithm logarithm = new Logarithm(-1, 4);
		double result;
		
		try { 
			result = logarithm.doubleValue(); 
		}
		catch(Exception ex) {
			System.out.println("Error occured during logarithm operation: "+ex);
			return;
		}
		
		System.out.println("Result: "+ result);
		

	}

}
