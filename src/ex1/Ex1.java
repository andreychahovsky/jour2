package ex1;

public class Ex1 {

    private Integer age;
    private String category;

    public Ex1(Integer age) {
        this.age = age;
    }

    public String CheckAge(Integer age) {
        switch (age) {
            case 6:
            case 7:
                category = "poussin";
                break;
            case 8:
            case 9:
                category = "pupille";
                break;
            case 10:
            case 11:
                category = "minime";
                break;
            default:
                if (age >= 12 && age < 100) {
                    category = "cadet";
                    break;
                }
                break;
        }

        if (this.category == null) {
            this.category = "Error";
        }

        return this.category;
    } 
}
