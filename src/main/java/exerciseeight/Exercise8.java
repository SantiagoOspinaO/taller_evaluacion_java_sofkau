package exerciseeight;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise8 {
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

    public static void main(String[] args) {
        isAWorkingDay();
    }
}
