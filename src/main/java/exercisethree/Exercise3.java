package exercisethree;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise3 {
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

    public static void main(String[] args) {
        calculateAreaOfCircle();
    }
}
