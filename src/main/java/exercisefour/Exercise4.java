package exercisefour;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise4 {
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

    public static void main(String[] args) {
        priceWithVAT();
    }
}
