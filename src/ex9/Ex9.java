package ex9;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {
    public ArrayList<Integer> list;
    public HashMap<Integer, String> resHashMap;
    
    public Ex9(ArrayList<Integer> list) {
        this.list = list;
    }

    public HashMap<Integer, String> FizzBuzz(ArrayList<Integer> list) {
        resHashMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%3 == 0) {
                resHashMap.put(list.get(i), "Fizz");
            }
            if (list.get(i)%5 == 0) {
                resHashMap.put(list.get(i), "Buzz");
            }
            if (list.get(i)%5 == 0 && list.get(i)%3 == 0) {
                resHashMap.put(list.get(i), "FizzBuzz");
            }
        }
        return resHashMap;
    }
}
