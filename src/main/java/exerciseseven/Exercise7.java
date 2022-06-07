package exerciseseven;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 7.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise7 {
    /**
     * Se crea el metodo Greater or equal to zero con el objetivo de comprobar que el numero ingresado sea mayor a cero.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void greaterOrEqualToZero() {
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);
        double number;

        do {
            logger.info("Ingrese un numero mayor o igual a 0");
            number = in.nextDouble();

            if (number >= 0) {
                String message = "El " + number + " es mayor o igual a 0";
                logger.info(message);
            }

        } while(number < 0);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        greaterOrEqualToZero();
    }
}
