package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] array;

    public Histogram(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }
    
    public Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<>();
        for (T i : array) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        return histogram;
    }
}
