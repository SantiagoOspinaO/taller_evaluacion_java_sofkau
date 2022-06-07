package exercisenine;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 9.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise9 {
    /**
     * Se crea el metodo Replace a with e con el objetivo de reemplazar las letras a por una e.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void replaceAWithE() {
         Logger logger = Logger.getLogger("logger");
         Scanner in = new Scanner(System.in);
         String text = "La sonrisa sera la mejor arma contra la tristeza";

         logger.info("Ingrese una frase");
         String sentenceInput = in.nextLine();
         String newSentence = text.replace("a", "e");
         String result = newSentence + " " + sentenceInput;
         logger.info(result);
     }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        replaceAWithE();
    }
}
