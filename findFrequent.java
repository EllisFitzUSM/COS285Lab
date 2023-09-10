import java.util.HashMap;
import java.util.Map;

public static Fraction findFrequent(Fraction[] input) {
    Map<Fraction, Integer> frequencyMap = new HashMap<>();
    Fraction mostFrequent = null;
    int maxFrequency = 0;

    for (Fraction fraction : input) {
        int frequency = frequencyMap.getOrDefault(fraction, 0) + 1;
        frequencyMap.put(fraction, frequency);

        if (frequency > maxFrequency) {
            maxFrequency = frequency;
            mostFrequent = fraction;
        }
    }

    return mostFrequent;
}