package ex10;

public class Ex10 {
    public String string;
    public String resString;

    public Ex10(String string) {
        this.string = string;
    }

    public String Invert(String string) {
        resString = new StringBuilder(string).reverse().toString();
        return resString;
    }

}
