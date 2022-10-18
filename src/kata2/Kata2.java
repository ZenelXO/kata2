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
        Map<Integer, Integer> histograma = new HashMap<Integer, Integer>();
        
        for (int i : data) {
            if(histograma.containsKey(data[i])){
                histograma.put(i, histograma.containsKey(i) ? histograma.get(i) + 1 : 1);
            }else{
                histograma.put(i, 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry: histograma.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        
    }
    
}