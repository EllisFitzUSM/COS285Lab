/**
 * Fraction - A class that encapsulates a fraction value by seperating the numerator and denominator
 * @author Ellis, Josh, Jonah, Gabrielle
 * @version 6 September 2023
 */
public class Fraction implements INumber {
    int numerator;
    int denominator;
    
    /**
     * @author Ellis Fitzgerald
     * printReverse - Prints the reverse of an array by a process of recursion
     * @param inputArray
     */
    void printReverse(Fraction[] inputArray) {
        if(inputArray.length > 1) {
            System.out.print(inputArray[inputArray.length - 1] + ", ");
            printReverse(removeLast(inputArray));
        }
        else {
            System.out.print(inputArray[inputArray.length - 1]);
        }
    }
    
    /**
     * @author Ellis Fitzgerald
     * removeLast - Returns an array with the same elements as inputArray but without its last element
     * @param inputArray - The inputted Fraction array
     * @return lastRemoved - inputArray without its last element
     */
    Fraction[] removeLast(Fraction[] inputArray) {
        Fraction[] lastRemoved = new Fraction[inputArray.length - 1];
        for(int i = 0; i < lastRemoved.length; i++) {
            lastRemoved[i] = inputArray[i];
        }
        return lastRemoved;
    }
    
}