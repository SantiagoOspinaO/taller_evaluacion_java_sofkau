package exercisethree;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 3.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise3 {
    /**
     * Se crea el metodo Calculate area of circle con el objetivo de calcular el area de un circulo.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void calculateAreaOfCircle() {
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);
        String operation = "";

        logger.info("Ingrese el radio del circulo");
        String radio = in.nextLine();
        double radioDouble = Double.parseDouble(radio);

        operation = String.valueOf(Math.PI * (Math.pow(radioDouble, 2)));
        String result = "El area del circulo es " + operation;
        logger.info(result);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        calculateAreaOfCircle();
    }
}
