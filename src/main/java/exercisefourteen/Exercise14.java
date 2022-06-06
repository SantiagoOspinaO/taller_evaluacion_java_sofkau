package exercisefourteen;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise14 {
    public static void numbersToOneThousand() {

        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);

        logger.info("Ingrese un numero");
        int number = in.nextInt();

        for(int i=number; i<=1000; i+=2){
            String result = String.valueOf(i);
            logger.info(result);
        }
    }

    public static void main(String[] args) {
        numbersToOneThousand();
    }
}
