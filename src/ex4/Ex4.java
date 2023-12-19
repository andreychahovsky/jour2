package ex4;

public class Ex4 {
    public Double montats;
    public Double prixHT;
    public Double prixTTC; 

    public Ex4(Double montants) {
        this.montats = montants;
    }

    public void CheckPrix(Double montats) {
        if (montats <= 200) {
            prixHT = montats;
        }
        if (montats > 200) {
            prixHT = montats * 0.85;
        }
        prixTTC = prixHT * 1.2;
    }

    public Double getPrixHT() {
        return prixHT;
    }

    public Double getPrixTTC() {
        return prixTTC;
    }
}
