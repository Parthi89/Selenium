package week1.day1;

public class Factorial {
int number = 5;
long fact = 1;
{
for (int i=1; i <= number; i++) {
	fact = fact*i;
} 
}
public static void main(String[] args) {
	
	Factorial objFact = new Factorial();
	
	System.out.println(objFact.fact);
}


}
