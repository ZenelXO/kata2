package kata2;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Ángel H.O
 */
public class Histogram<T> {
    private final T[] data;
    
    public Histogram(T[] data){
        this.data = data;
    }
    
    public T[] getData(){
        return data;
    }
    
    //VERSION 4
    public Map getHistogram(){
        Map<T, Integer> histogram = new HashMap<T, Integer>();
        
        for(int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i]) + 1);
            }else{
                histogram.put(data[i], 1);
            }
        }
        return histogram;
    }
}
