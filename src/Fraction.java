/**
 * Fraction - A class that encapsulates a fraction value by seperating the
 * numerator and denominator
 * 
 * @author Ellis, Josh, Jonah, Gabrielle
 * @version 6 September 2023
 */
public class Fraction implements INumber {
	int numerator;
	int denominator;
	
	/**
	 * @author Jonah Kastelic
	 * Constructor for Fraction objects
	 * @param i AKA numerator int
	 * @param j AKA denominator int
	 */
	public Fraction(int i, int j) {
		this.numerator = i;
		this.denominator = i;
	}
	
	/**
	 * Void method for testing various methods within the Fraction class
	 * @param args
	 */
	public static void main(String[] args) {
		Fraction[] fractionArray = new Fraction[100];
		for(int i=0; i<fractionArray.length; i++)
		fractionArray[i] = new Fraction(i, i+1);
		
		printReverse(fractionArray);
	}
	/**
	 * @author Jonah Kastelic 
	 * printReverse return value: Prints a reversed array of fractions
	 * @param inputArray an array of Fraction objects to be reversed
	 */
	static void printReverse(Fraction[] inputArray) {
		for (int i = inputArray.length - 1; i >= 0; i--) {
			System.out.print(inputArray[i].toString());
		}
	}
	
	/**
	 * @author Jonah Kastelic
	 * toString method which allows for Fractions to be easily printed
	 * @return String of numerators and denominators
	 */
	public String toString() {
		return " (" + numerator + "," + denominator + ") ";
	}
}

