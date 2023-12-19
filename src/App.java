import java.util.Scanner;

import ex1.Ex1;
import ex2.Ex2;
import ex3.Ex3;
import ex4.Ex4;
import ex5.Ex5;

public class App {
    public static void main(String[] args) throws Exception {

        // Start of the jour 2
        System.out.printf("%n· %76s ·%n", " ");

        String col1 = "JAVA jour 2";
        Integer widthColumn = 20;
        String lineType = "─";

        String line = lineType.repeat(widthColumn);
        String space = "%" + Integer.toString(widthColumn - 2) + "s";

        System.out.printf("┌" + space + "┐%n", line);
        System.out.printf("│ " + space + " │%n", col1);
        System.out.printf("└" + space + "┘%n", line);

        Scanner scanner = new Scanner(System.in);

        // Exercice 1
        System.out.println("\n== Exercice 1 ==\n");
        System.out.printf("Entre l'âge d'un enfant: %s", "");
        Integer age = (Integer) scanner.nextInt();

        Ex1 ex1 = new Ex1(age);
        String replyEx1 = ex1.CheckAge(age);

        System.out.printf("Votre enfant est dans le category %s%n", replyEx1);

        // Exercice 2
        System.out.println("\n== Exercice 2 ==\n");
        Ex2 ex2 = new Ex2();
        Integer replyEx2 = ex2.CalculateSumm();

        System.out.printf("La somme  S=1+2+3+...+ 10: %d%n", replyEx2);

        // Exercice 3
        System.out.println("\n== Exercice 3 ==\n");
        System.out.printf("Entre nomber a: %s", "");
        Integer a = (Integer) scanner.nextInt();
        System.out.printf("Entre nomber b: %s", "");
        Integer b = (Integer) scanner.nextInt();

        Ex3 ex3 = new Ex3(a, b);
        ex3.ChangerAB();
        int aNew = ex3.getA();
        int bNew = ex3.getB();
        System.out.println("Inverse:");

        Integer var1 = aNew;
        Integer var2 = bNew;
        col1 = Integer.toString(a);
        String col2 = Integer.toString(b);

        System.out.printf("┌" + space + "┬" + space + "┐%n", line, line);
        System.out.printf("│ " + space + " │ " + space + " │%n", col1, col2);
        System.out.printf("├" + space + "┼" + space + "┤%n", line, line);
        
        System.out.printf("│ " + space + " │ " + space + " │%n", var1, var2);
        
        System.out.printf("└" + space + "┴" + space + "┘%n", line, line);

        // Exercice 4
        System.out.println("\n== Exercice 4 ==\n");
        System.out.printf("Entre vos montants d`achat: %s", "");
        Double montats = (Double) scanner.nextDouble();

        Ex4 ex4 = new Ex4(montats);
        ex4.CheckPrix(montats);
        Double prixHT = ex4.getPrixHT();
        Double prixTTC = ex4.getPrixTTC();

        String varMontats = Double.toString(montats);
        String varPrix = Double.toString(Math.round(prixHT));
        String var3 = Double.toString(Math.round(prixTTC));
        col1 = "Montats";
        col2 = "Prix HT";
        String col3 = "Prix TTC";

        System.out.printf("┌" + space + "┬" + space + "┬" + space + "┐%n", line, line, line);
        System.out.printf("│ " + space + " │ " + space + " │ " + space + " │%n", col1, col2, col3);
        System.out.printf("├" + space + "┼" + space + "┼" + space + "┤%n", line, line, line);

        System.out.printf("│ " + space + " │ " + space + " │ " + space + " │%n", varMontats, varPrix, var3);

        System.out.printf("└" + space + "┴" + space + "┴" + space + "┘%n", line, line, line);

        // Exercice 5
        System.out.println("\n== Exercice 5 ==\n");
        System.out.printf("Entre votre Nom: %s", "");
        String nom = scanner.next();

        Ex5 ex5 = new Ex5(nom);
        String replyEx5 = ex5.SayBonjour(nom);
        System.out.println(replyEx5);
        

        // End of the jour 2
        scanner.close();

        System.out.printf("%n· %76s ·%n", " ");
    }
}