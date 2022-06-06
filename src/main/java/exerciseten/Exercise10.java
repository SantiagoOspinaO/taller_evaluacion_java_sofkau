package exerciseten;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise10 {
    public static void eliminateBlankSpaces() {
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);

        logger.info("Ingrese una frase");
        String sentence = in.nextLine();

        String withoutSpaces = sentence.replace(" ", "");
        String sentenceFinal = "Frase sin espacios: " + withoutSpaces;
        logger.info(sentenceFinal);
    }

    public static void main(String[] args) {
        eliminateBlankSpaces();
    }
}
