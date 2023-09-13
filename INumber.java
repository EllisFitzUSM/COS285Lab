/**
 * INumber - An interface to operate on different forms of numeric data
 * @author Ellis, Josh, Jonah, Gabrielle
 * @param <T> - Generic Type
 */
public interface INumber<T> {
    T plus(T input);
    T minus(T input);
    T divide(T input);
    T multiply(T input);
    
    void print();
}