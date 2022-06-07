package exercisefour;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 4.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise4 {
    /**
     * Se crea el metodo Price with vat con el objetivo de calcular el precio de un producto más el IVA.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void priceWithVAT() {
        final double IVA = 0.21;
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);

        logger.info("Ingrese el precio del producto");
        double price = in.nextDouble();
        double productMoreVat = (price * IVA) + price;
        String result = "El precio del producto más el IVA es " + productMoreVat;
        logger.info(result);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        priceWithVAT();
    }
}
