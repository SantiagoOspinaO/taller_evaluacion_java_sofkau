package exerciseeleven;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise11 {
    public static void lengthAndVowels(){
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);
        int counterA = 0;
        int counterE = 0;
        int counterI = 0;
        int counterO = 0;
        int counterU = 0;

        logger.info("Ingrese una frase");
        String sentence = in.nextLine().toLowerCase();
        sentence = sentence.replace(" ", "");
        String sentenceLength = "La longitud es de: " + sentence.length();
        logger.info(sentenceLength);

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a') {
                counterA++;
            } else if (sentence.charAt(i) == 'e') {
                counterE++;
            } else if (sentence.charAt(i) == 'i') {
                counterI++;
            } else if (sentence.charAt(i) == 'o') {
                counterO++;
            } else if (sentence.charAt(i) == 'u') {
                counterU++;
            }
        }
        String vowelsA = "Vocal A: " + counterA;
        logger.info(vowelsA);
        String vowelsE = "Vocal E: " + counterE;
        logger.info(vowelsE);
        String vowelsI = "Vocal I: " + counterI;
        logger.info(vowelsI);
        String vowelsO = "Vocal O: " + counterO;
        logger.info(vowelsO);
        String vowelsU = "Vocal U: " + counterU;
        logger.info(vowelsU);
    }

    public static void main(String[] args) {
        lengthAndVowels();
    }
}
