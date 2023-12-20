package ex11;

import java.lang.reflect.Array;

public class Ex11 {
    private int[] array;
    private int resMax;

    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    public int getresMax() {
        return resMax;
    }
    public void setresMax(int resMax) {
        this.resMax = resMax;
    }
    public Ex11(int[] array) {
        this.array = array;
    }
    public Ex11() {
    }
    
    public int chercherGrand(int[] array) {
            resMax = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > resMax) {
                    resMax = array[i];
                } 
            }

        return resMax;
    }
}
