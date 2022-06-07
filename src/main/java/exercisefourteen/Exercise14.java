package exercisefourteen;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 14.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise14 {
    /**
     * Se crea el metodo Numbers to one thousand con el objetivo de imprimir los numeros hasta el 1000 desde el numero que
     * ingresen por teclado.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
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

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        numbersToOneThousand();
    }
}
