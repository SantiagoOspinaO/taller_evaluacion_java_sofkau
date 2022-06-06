package exercisesix;

import java.util.logging.Logger;

public class Exercise6 {

    public static void showOddAndEvenNumbers() {
        Logger logger = Logger.getLogger("logger");
        int number;
        int numberOdd;
        int numberEven;
        String result;

        for (number = 0; number <= 100; number++) {
            if (number % 2 == 0) {
                numberOdd = number;
                result = "Par: " + numberOdd;
                logger.info(result);
            } else {
                numberEven = number;
                result = "Impar: " + numberEven;
                logger.info(result);
            }
        }
    }

    public static void main(String[] args) {
        showOddAndEvenNumbers();
    }
}
