package exerciseone;

import java.util.logging.Logger;

public class Exercise1 {
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

    public static void main(String[] args) {
        calculateLargerNumber(6, 7);
    }
}
