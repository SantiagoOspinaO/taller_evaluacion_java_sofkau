package exerciseeighteen;

/**
 * Se crea la clase Serie y se implementa la interfaz IDeliverable con el objetivo de modelar una serie además
 * de implementar sus metodos
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Serie implements IDeliverable {

    private static final int DEFINED_NUMBER_SEASONS = 3;
    private static final boolean DEFINED_DELIVERED = false;

    private String title;
    private int numberSeasons;
    private boolean delivered;
    private String genre;
    private String creator;

    /**
     * Instantiates a new Serie.
     */
    public Serie() {
    }

    /**
     * Instantiates a new Serie.
     *
     * @param title   the title
     * @param creator the creator
     */
    public Serie(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    /**
     * Instantiates a new Serie.
     *
     * @param title         the title
     * @param numberSeasons the number seasons
     * @param genre         the genre
     * @param creator       the creator
     */
    public Serie(String title, int numberSeasons, String genre, String creator) {
        this.title = title;
        this.numberSeasons = numberSeasons;
        this.genre = genre;
        this.creator = creator;
    }

    @Override
    public void deliver() {
        delivered = true;
    }

    @Override
    public void sendBack() {
        delivered = false;
    }

    @Override
    public boolean isDelivered() {
        return delivered;
    }

    /**
     * Se sobre escribe el metodo Compare to con el objetivo de devolver la serie con mas temporadas
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    @Override
    public int compareTo(Object object) {
        Serie serie = (Serie) object;
        int numberSeasonsCompare = 0;
        if (numberSeasons > serie.getNumberSeasons()) {
            numberSeasonsCompare = 1;
        } else if (numberSeasons < serie.getNumberSeasons()) {
            numberSeasonsCompare = -1;
        }
        return numberSeasonsCompare;
    }

    @Override
    public String toString() {
        return "Serie {" +
                "title='" + title + '\'' +
                ", numberSeasons=" + numberSeasons +
                ", delivered=" + delivered +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
                '}';
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets number seasons.
     *
     * @return the number seasons
     */
    public int getNumberSeasons() {
        return numberSeasons;
    }

    /**
     * Sets number seasons.
     *
     * @param numberSeasons the number seasons
     */
    public void setNumberSeasons(int numberSeasons) {
        if (numberSeasons == 0) {
            this.numberSeasons = DEFINED_NUMBER_SEASONS;
        } else {
            this.numberSeasons = numberSeasons;
        }
    }

    /**
     * Gets genre.
     *
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets genre.
     *
     * @param genre the genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets creator.
     *
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets creator.
     *
     * @param creator the creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
}
