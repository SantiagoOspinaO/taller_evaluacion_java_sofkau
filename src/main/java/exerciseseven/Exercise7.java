package exerciseseven;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise7 {
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

    public static void main(String[] args) {
        greaterOrEqualToZero();
    }
}
