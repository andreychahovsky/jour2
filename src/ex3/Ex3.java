package ex3;

import javax.swing.event.ChangeEvent;

public class Ex3 {
    public Integer a;
    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer b;

    public Ex3(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public void ChangerAB() {
        Integer tempNumber = a;
        a = b;
        b = tempNumber;
    }
}
