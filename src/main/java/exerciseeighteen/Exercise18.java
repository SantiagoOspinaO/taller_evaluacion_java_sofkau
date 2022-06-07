package exerciseeighteen;

import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 18.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise18 {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("logger");
        Serie serie = new Serie();

        Serie[] seriesList = new Serie[5];
        Videogame[] videogamesList = new Videogame[5];

        seriesList[0] = new Serie("Elite", "Carlos Montero");
        seriesList[0].setNumberSeasons(serie.getNumberSeasons());
        seriesList[1] = new Serie("Stranger Things", "Ross Duffer");
        seriesList[2] = new Serie("Palpito", "Leonardo Padrón");
        seriesList[3] = new Serie("Monstrous de Cracovia", "Kasia Adamik");
        seriesList[4] = new Serie("Bienvenidos a Edén", 1, "Drama", "Joaquín Guillermo");

        videogamesList[0] = new Videogame("Super Mario Bros", 2);
        videogamesList[1] = new Videogame("Grand Theft Auto: San Andreas", 150);
        videogamesList[2] = new Videogame("Dying Light 2", 20);
        videogamesList[3] = new Videogame("Call of Duty Modern Warfare", 5);
        videogamesList[4] = new Videogame("The Last of Us", 25, "Acción y aventura", "Sony Computer");

        seriesList[1].deliver();
        seriesList[4].deliver();
        seriesList[2].deliver();
        videogamesList[3].deliver();
        videogamesList[4].deliver();

        int delivered = 0;
        for (int i = 0; i < seriesList.length; i++) {
            if (seriesList[i].isDelivered()) {
                delivered++;
                seriesList[i].sendBack();
            }
            if (videogamesList[i].isDelivered()) {
                delivered++;
                videogamesList[i].sendBack();
            }
        }
        String message = "Series y VideoJuegos entregados: " + delivered;
        logger.info(message);

        Serie withMoreSeasons = seriesList[0];
        Videogame withMoreEstimatedHours = videogamesList[0];

        for (Serie value : seriesList) {
            if (value.compareTo(withMoreSeasons) == 1) {
                withMoreSeasons = value;
            }
        }
        for (Videogame videogame : videogamesList) {
            if (videogame.compareTo(withMoreEstimatedHours) == 1) {
                withMoreEstimatedHours = videogame;
            }
        }
        String moreSeasons = "La serie con más temporadas: " + withMoreSeasons.toString();
        logger.info(moreSeasons);
        String moreEstimatedHours = "El VideJuego con más horas de juego: " + withMoreEstimatedHours.toString();
        logger.info(moreEstimatedHours);
    }
}
