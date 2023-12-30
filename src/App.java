import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ex1.Ex1;
import ex2.Ex2;
import ex3.Ex3;
import ex4.Ex4;
import ex5.Ex5;
import ex6.Ex6;
import ex7.Ex7;
import ex8.Ex8;
import ex9.Ex9;
import ex10.Ex10;
import ex11.Ex11;
import ex12.Ex12;
import ex13.Ex13;

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

        System.out.printf("La somme S=1+2+3+...+ 10: %d%n", replyEx2);

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

        System.out.printf("┌" + space + "┬" + space + "┬" + space + "┐%n", line,
        line, line);
        System.out.printf("│ " + space + " │ " + space + " │ " + space + " │%n",
        col1, col2, col3);
        System.out.printf("├" + space + "┼" + space + "┼" + space + "┤%n", line,
        line, line);

        System.out.printf("│ " + space + " │ " + space + " │ " + space + " │%n",
        varMontats, varPrix, var3);

        System.out.printf("└" + space + "┴" + space + "┴" + space + "┘%n", line,
        line, line);

        // Exercice 5
        System.out.println("\n== Exercice 5 ==\n");
        System.out.printf("Entre votre Nom: %s", "");
        String nom = scanner.next();

        Ex5 ex5 = new Ex5(nom);
        String replyEx5 = ex5.SayBonjour(nom);
        System.out.println(replyEx5);

        // Exercice 6
        System.out.println("\n== Exercice 6 ==\n");
        System.out.printf("Entre nomber n1: %s", "");
        Double n1 = (Double) scanner.nextDouble();
        System.out.printf("Entre nomber n2: %s", "");
        Double n2 = (Double) scanner.nextDouble();

        Ex6 ex6 = new Ex6(n1, n2);
        ex6.Calculer(n1, n2);
        Double somme = ex6.getSomme();
        Double multiplier = ex6.getMultiplier();
        Double soustraire = ex6.getSoustraire();
        Double diviser = ex6.getDiviser();
        Double reste = ex6.getReste();

        String sommeString = Double.toString(somme);
        String multiplieString = Double.toString(multiplier);
        String soustraireString = Double.toString(soustraire);
        String diviserString = Double.toString(diviser);
        String resteString = Double.toString(reste);
        col1 = "Somme";
        col2 = "Multiplier";
        col3 = "Soustraire";
        String col4 = "Diviser";
        String col5 = "Reste";

        System.out.printf("┌" + space + "┬" + space + "┬" + space + "┬" + space + "┬"
        + space + "┐%n", line, line, line, line, line);
        System.out.printf("│ " + space + " │ " + space + " │ " + space + " │ " +
        space + " │ " + space + " │%n", col1, col2, col3, col4, col5);
        System.out.printf("├" + space + "┼" + space + "┼" + space + "┼" + space + "┼"
        + space + "┤%n", line, line, line, line, line);

        System.out.printf("│ " + space + " │ " + space + " │ " + space + " │ " +
        space + " │ " + space + " │%n", sommeString, multiplieString,
        soustraireString, diviserString, resteString);

        System.out.printf("└" + space + "┴" + space + "┴" + space + "┴" + space+ "┴"
        + space + "┘%n", line, line, line, line, line);

        // Exercice 7
        System.out.println("\n== Exercice 7 ==\n");
        System.out.printf("Entre nomber i1: %s", "");
        Integer i1 = (Integer) scanner.nextInt();
        System.out.printf("Entre nomber i2: %s", "");
        Integer i2 = (Integer) scanner.nextInt();
        System.out.printf("Entre nomber i3: %s", "");
        Integer i3 = (Integer) scanner.nextInt();

        Ex7 ex7 = new Ex7(i1, i2, i3);
        String replyEx7 = ex7.Compare(i1, i2, i3);
        System.out.println(replyEx7);

        // Exercice 8
        System.out.println("\n== Exercice 8 ==\n");

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listT1 = new ArrayList<>();
        ArrayList<Integer> listT2 = new ArrayList<>();

        int i = 0;
        int n = 10;
        for (i = 0; i < n; i++) {
        System.out.printf("Entre number: %s", "");
        list.add(scanner.nextInt());
        }

        Ex8 ex8 = new Ex8(list, n);
        ex8.PareIparer(list, n);

        System.out.printf("Pairs: %d%n", ex8.getComptPairs());
        System.out.printf("Impairs: %d%n", ex8.getComptImpairs());

        listT1 = ex8.getListT1();
        listT2 = ex8.getListT2();
        col1 = "T1";
        col2 = "T2";

        System.out.printf("┌" + space + "┬" + space + "┐%n", line, line);
        System.out.printf("│ " + space + " │ " + space + " │%n", col1, col2);
        System.out.printf("├" + space + "┼" + space + "┤%n", line, line);

        System.out.printf("│ " + space + " │ " + space + " │%n", listT1, listT2);

        System.out.printf("└" + space + "┴" + space + "┘%n", line, line);

        // Exercice 9
        System.out.println("\n== Exercice 9 ==\n");

        ArrayList<Integer> listEx9 = new ArrayList<>();
        HashMap<Integer, String> replyEx9 = new HashMap<Integer, String>();
        for (int k = 1; k <= 100; k++) {
        listEx9.add(k);
        }

        Ex9 ex9 = new Ex9(listEx9);
        replyEx9 = ex9.FizzBuzz(listEx9);

        System.out.println("Votre list result is:");
        System.out.println(replyEx9);

        // Exercice 10
        System.out.println("\n== Exercice 10 ==\n");

        String stringEx10 = new String();

        Ex10 ex10 = new Ex10(stringEx10);

        System.out.printf("Entre string: %s", "");
        stringEx10 = (String) scanner.nextLine();

        System.out.printf("Votre string is: %s%n", stringEx10);

        String replyEx10 = ex10.Invert(stringEx10);
        System.out.printf("\nVotre Invert list is: %s%n%n", replyEx10);

        // Exercice 11
        System.out.println("\n== Exercice 11 ==\n");

        int[] tab = {1, 2, 9, 4};
        Ex11 ex11 = new Ex11(tab);
        int replyEx11 = ex11.chercherGrand(tab);

        System.out.println("For array {1, 2, 9, 4} max is " + replyEx11);

        // Exercice 12
        System.out.println("\n== Exercice 12 ==\n");
        Ex12 ex12 = new Ex12();
        ex12.devenirNumber();

        // Exercice 13
        System.out.println("\n== Exercice 13 ==\n");
        Ex13 ex13 = new Ex13();
        ex13.paintFace();
        System.out.println("\n");

        // End of the jour 2
        col1 = "FIN";

        System.out.printf("┌" + space + "┐%n", line);
        System.out.printf("│ " + space + " │%n", col1);
        System.out.printf("└" + space + "┘%n", line);

        scanner.close();
        System.out.printf("%n· %76s ·%n", " ");

    }
}