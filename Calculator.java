package week1.day2;

public class Calculator {

	
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		int sumValue = num1 + num2;
	
	    return sumValue;
	}
	
	public double sub(double num1, double num2) {
		// TODO Auto-generated method stub
		double subValue = num1 - num2;
		return subValue;

	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.sub(10, 20));
		
	}
}
