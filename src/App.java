import java.util.Scanner;

import ex1.Ex1;
import ex2.Ex2;

public class App {
    public static void main(String[] args) throws Exception {

        // Start of the jour 2
        System.out.printf("%n· %76s ·%n", " ");

        String col1 = "JAVA jour 2";
        Integer widthColumn = 70;
        String lineType = "─";

        String line = lineType.repeat(widthColumn);
        String space = "%" + Integer.toString(widthColumn - 2) + "s";

        System.out.printf("┌" + space + "┐%n", line);
        System.out.printf("│ " + space + " │%n", col1);
        System.out.printf("└" + space + "┘%n", line);

        Scanner scanner = new Scanner(System.in);

        // Exercice 1
        System.out.println("\nExercice 1\n");
        System.out.printf("Entre l'âge d'un enfant: %s", "");
        Integer age = (Integer) scanner.nextInt();

        Ex1 ex1 = new Ex1(age);
        String replyEx1 = ex1.CheckAge(age);

        System.out.printf("Votre enfant est dans le category %s%n", replyEx1);

        // Exercice 2
        System.out.println("\nExercice 2\n");
        Ex2 ex2 = new Ex2();
        Integer replyEx2 = ex2.CalculateSumm();

        System.out.printf("La somme  S=1+2+3+...+ 10: %d%n", replyEx2);
        // End of the jour 2
        scanner.close();

        System.out.printf("%n· %76s ·%n", " ");
    }
}