package exercisefive;

import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 5.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise5 {
    /**
     * Se crea el metodo Show odd and even numbers con el objetivo de pintar los numeros pares e impares hasta el 100.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void showOddAndEvenNumbers() {
        Logger logger = Logger.getLogger("logger");
        int number = 0;
        int numberOdd;
        int numberEven;
        String result;

        while (number <= 100) {
            if (number % 2 == 0) {
                numberOdd = number;
                result = "Par: " + numberOdd;
                logger.info(result);
            } else {
                numberEven = number;
                result = "Impar: " + numberEven;
                logger.info(result);
            }
            number++;
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        showOddAndEvenNumbers();
    }
}


