package exerciseten;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 10.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise10 {
    /**
     * Se crea el metodo Eliminate blank spaces con el objetivo de eliminar los espacios en blanco de una frase.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void eliminateBlankSpaces() {
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);

        logger.info("Ingrese una frase");
        String sentence = in.nextLine();

        String withoutSpaces = sentence.replace(" ", "");
        String sentenceFinal = "Frase sin espacios: " + withoutSpaces;
        logger.info(sentenceFinal);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        eliminateBlankSpaces();
    }
}
