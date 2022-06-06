package exercisetwelve;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise12 {
    public static void areEqual() {
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);

        logger.info("Ingrese la primer palabra");
        String firstWord = in.nextLine();
        logger.info("Ingrese la segunda palabra");
        String secondWord = in.nextLine();

        String[] arrayFirstWord = firstWord.split("");
        String[] arraySecondWord = secondWord.split("");

        if (firstWord.equalsIgnoreCase(secondWord)) {
            logger.info("Las palabras son iguales");
        } else if (arrayFirstWord.length > arraySecondWord.length) {
            for (int i = 0; i < arraySecondWord.length; i++) {
                if (!(arrayFirstWord[i].equals(arraySecondWord[i]))) {
                    String message = "Son diferentes en " + firstWord + "[" + arrayFirstWord[i] + "]" + " = " + secondWord + "[" + arraySecondWord[i] + "]";
                    logger.info(message);
                }
            }
        } else if (arrayFirstWord.length < arraySecondWord.length) {
            for (int i = 0; i < arrayFirstWord.length; i++) {
                if (!(arraySecondWord[i].equals(arrayFirstWord[i]))) {
                    String message = "Son diferentes en " + firstWord + "[" + arrayFirstWord[i] + "]" + " = " + secondWord + "[" + arraySecondWord[i] + "]";
                    logger.info(message);
                }
            }
        } else {
            for (int i = 0; i < arrayFirstWord.length; i++) {
                if (!(arraySecondWord[i].equals(arrayFirstWord[i]))) {
                    String message = "Son diferentes en " + firstWord + "[" + arrayFirstWord[i] + "]" + " = " + secondWord + "[" + arraySecondWord[i] + "]";
                    logger.info(message);
                }
            }
        }
    }

    public static void main(String[] args) {
        areEqual();
    }
}
