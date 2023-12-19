package ex7;

public class Ex7 {
    public Integer i1;
    public Integer i2;
    public Integer i3;
    public String ego;

    public Ex7(Integer i1, Integer i2, Integer i3) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }

    public String Compare(Integer i1, Integer i2, Integer i3) {
        ego = "Ni tous ni égaux ni différents";
        if (i1 == i2 && i2 == i3) {
            ego = "Tous les nombres sont égaux";
        }
        if (i1 != i2 && i2 != i3 && i3 != i1) {
            ego = "Tous les nombres sont différents";
        }
        return ego;
    }

}
