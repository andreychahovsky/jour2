package ex6;

public class Ex6 {
    public Double n1;
    public Double n2;
    public Double somme;
    public Double multiplier;
    public Double soustraire;
    public Double diviser;
    public Double reste;

    public Double getSomme() {
        return somme;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public Double getSoustraire() {
        return soustraire;
    }

    public Double getDiviser() {
        return diviser;
    }

    public Double getReste() {
        return reste;
    }

    public Ex6(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void Calculer(Double n1, Double n2) {
        somme = n1 + n2;
        multiplier = n1 * n2;
        soustraire = n1 - n2;
        diviser = n1 / n2;
        reste = 100 * n1 / n2;
    }
}
