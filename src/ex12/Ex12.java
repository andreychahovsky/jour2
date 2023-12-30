package ex12;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Ex12 {

    public Ex12() {
    }

    public void devenirNumber() {
        Scanner scanner = new Scanner(System.in);

        Integer secretNumber = ThreadLocalRandom.current().nextInt(1, 101);
        Integer numberToDevenir = secretNumber + 1;
        Integer essays = 0;
        while (numberToDevenir != secretNumber) {
            essays += 1;
            System.out.printf("\nEssaye devenir un nomber entre 1..100: %s", "");
            numberToDevenir = (Integer) scanner.nextInt();
            if (numberToDevenir > secretNumber) {
                System.out.printf(Integer.toString(numberToDevenir) + " est trop grand!\nEssaye encore ...\n");
            }
            if (numberToDevenir < secretNumber) {
                System.out.printf(Integer.toString(numberToDevenir) + " est trop petit!\nEssaye encore ...\n");
            }
        }

        System.out.printf("Bravo! " + Integer.toString(numberToDevenir) + " est correct! " + Integer.toString(essays) + " essays.\n");

        scanner.close();
    }

}
