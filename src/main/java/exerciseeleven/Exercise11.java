package exerciseeleven;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 11.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise11 {
    /**
     * Se crea el metodo Length and vowels con el objetivo de mostrar la longitud de la oracion y ademas contar las vocales.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
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

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        lengthAndVowels();
    }
}
