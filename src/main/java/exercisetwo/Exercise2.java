package exercisetwo;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 2.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise2 {
    /**
     * Se crea el metodo Calculate larger number con el objetivo de calcular cual de los dos numeros es mayor.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void calculateLargerNumber() {
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);

        logger.info("Ingrese el primer numero");
        double numberInput1 = in.nextDouble();
        logger.info("Ingrese el segundo numero");
        double numberInput2 = in.nextDouble();
        String result = "";

        if (numberInput1 > numberInput2) {
            result = "El numero " + numberInput1 + " es mayor que " + numberInput2;
        } else if (numberInput1 < numberInput2) {
            result = "El numero " + numberInput2 + " es mayor que " + numberInput1;
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
        calculateLargerNumber();
    }
}
