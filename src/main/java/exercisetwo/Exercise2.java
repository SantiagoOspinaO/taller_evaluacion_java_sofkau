package exercisetwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise2 {
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

    public static void main(String[] args) {
        calculateLargerNumber();
    }
}
