package exercisethirteen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class Exercise13 {
    public static void consultDateAndTime() {
        Logger log = Logger.getLogger("logger");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String result = "Fecha y hora ahora: " + dateTimeFormatter.format(LocalDateTime.now());
        log.info(result);
    }

    public static void main(String[] args) {
        consultDateAndTime();
    }
}
