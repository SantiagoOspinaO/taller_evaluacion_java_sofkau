package exercisethirteen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 13.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise13 {
    /**
     * Se crea el metodo Consult date and time con el objetivo de devolver la hora y fecha actual en formato: yyyy/MM/dd HH:mm:ss
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public static void consultDateAndTime() {
        Logger log = Logger.getLogger("logger");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String result = "Fecha y hora ahora: " + dateTimeFormatter.format(LocalDateTime.now());
        log.info(result);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        consultDateAndTime();
    }
}
