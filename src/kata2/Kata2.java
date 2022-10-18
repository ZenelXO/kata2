package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ángel H.O
 */
public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 2, 1, 3, 3, 4, 5, 2, 1, 1, 1, 6, 7, 8, 8};
        Histogram histo = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Map.Entry<Integer, Integer> entry: histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        
    }
    
}