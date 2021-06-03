package int_numer_of_repeates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    List<Integer> input = new ArrayList<>();
    input.add(1);
    input.add(3);
    input.add(1);

        System.out.println(calculateRepeats(input));
    }

    public static Map<Integer, Integer> calculateRepeats(List<Integer> input){
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer el : input){
            if(map.containsValue(el)){
                int count = map.get(el);
                map.put(el , ++count);
            }
            else{
                map.put(el,1);
            }
        }
        return map;
    }
}
