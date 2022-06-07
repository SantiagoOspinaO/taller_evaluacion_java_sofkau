package exerciseone;

import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 1.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise1 {
    /**
     * Se crea el metodo Calculate larger number con el objetivo de comprobar que numero es mayor o si son iguales.
     *
     * @param number1 the number 1
     * @param number2 the number 2
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void calculateLargerNumber(double number1, double number2) {
        Logger logger = Logger.getLogger("logger");
        String result = "";

        if (number1 > number2) {
            result = "El numero " + number1 + " es mayor a " + number2;
        } else if (number1 < number2) {
            result = "El numero " + number2 + " es mayor a " + number1;
        } else {
            result = "Los numeros son iguales";
        }
        logger.info(result);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        calculateLargerNumber(6, 7);
    }
}
