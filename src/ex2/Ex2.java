package ex2;

public class Ex2 {
    private Integer sum10;

    public Ex2 (){
    }

    public Integer CalculateSumm() {
        sum10 = 0;
        for (int i = 1; i <= 10; i++) {
            sum10 = sum10 + i;
        }
        return sum10;
    }
}
