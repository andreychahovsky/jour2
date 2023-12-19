package ex5;

public class Ex5 {
    public String nom;
    public String replyBonjour;

    public Ex5(String nom) {
        this.nom = nom;
    }

    public String SayBonjour(String nom) {
        replyBonjour = "Bonjour \n" + nom;
        return replyBonjour;
    }
}
