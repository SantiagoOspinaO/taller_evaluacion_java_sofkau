package exercisefifteen;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 15.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise15 {
    /**
     * Se crea el metodo Show options con el objetivo de pintar un menu para el usuario donde unicamente sale con la opcion 8.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void showOptions() {
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);
        logger.info("****** GESTION CINEMATOGRÁFICA ********");
        String menu = "Selecciona una opción:\n 1-NUEVO ACTOR\n 2-BUSCAR ACTOR\n 3-ELIMINAR ACTOR\n 4-MODIFICAR ACTOR\n 5-VER TODOS LOS ACTORES\n 6-VER PELICULAS DE LOS ACTORES\n 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n 8-SALIR";
        logger.info(menu);

        int option;
        do {
            option = in.nextInt();
            switch (option) {
                case 1, 2, 3, 4, 5, 6, 7:
                    logger.info(menu);
                    break;
                case 8:
                    logger.info("¡Vuelve pronto!");
                    break;
                default:
                    logger.info("¡Selecciona una opcion correcta!");
                    logger.info(menu);
            }
        } while (option != 8);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        showOptions();
    }
}
