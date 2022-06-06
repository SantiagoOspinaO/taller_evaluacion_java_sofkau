package exercisefive;

import java.util.logging.Logger;

public class Exercise5 {
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

    public static void main(String[] args) {
        showOddAndEvenNumbers();
    }
}


