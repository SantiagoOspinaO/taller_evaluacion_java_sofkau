package exerciseeight;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 8.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise8 {
    /**
     * Se crea el metodo Is a working day con el obejtivo de comprobar si el día que ingresen por consola es laboral o no.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void isAWorkingDay() {
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);

        logger.info("Seleccione un día\n 1.Lunes 2.Martes 3.Miércoles 4.Jueves 5.Viernes 6.Sábado 7.Domingo");
        int day = in.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5:
                logger.info("¡Día laboral!");
                break;
            case 6, 7:
                logger.info("¡Día de descanso!");
                break;
            default:
                logger.info("¡Opción incorrecta!");
                break;
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        isAWorkingDay();
    }
}
