package exerciseeighteen;

/**
 * Se crea la clase Videogame y se implementa la interfaz IDeliverable con el objetivo de modelar un videogame además
 * de implementar sus metodos.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Videogame implements IDeliverable {

    private static final int DEFINED_ESTIMATED_HOURS = 10;
    private static final boolean DEFINED_DELIVERED = false;

    private String title;
    private int estimatedHours;
    private boolean delivered;
    private String genre;
    private String company;

    /**
     * Instantiates a new Videogame.
     */
    public Videogame() {
    }

    /**
     * Instantiates a new Videogame.
     *
     * @param title          the title
     * @param estimatedHours the estimated hours
     */
    public Videogame(String title, int estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
    }

    /**
     * Instantiates a new Videogame.
     *
     * @param title          the title
     * @param estimatedHours the estimated hours
     * @param genre          the genre
     * @param company        the company
     */
    public Videogame(String title, int estimatedHours, String genre, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.genre = genre;
        this.company = company;
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
     * Se sobre escribe el metodo Compare to con el objetivo de devolver el video juego con más horas estimadas de juego.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    @Override
    public int compareTo(Object object) {
        Videogame videogame = (Videogame) object;
        int numberEstimatedHours = 0;
        if (estimatedHours > videogame.getEstimatedHours()) {
            numberEstimatedHours = 1;
        } else if (estimatedHours < videogame.getEstimatedHours()) {
            numberEstimatedHours = -1;
        }
        return numberEstimatedHours;
    }

    @Override
    public String toString() {
        return "Videogame {" +
                "title='" + title + '\'' +
                ", estimatedHours=" + estimatedHours +
                ", delivered=" + delivered +
                ", genre='" + genre + '\'' +
                ", company='" + company + '\'' +
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
     * Gets estimated hours.
     *
     * @return the estimated hours
     */
    public int getEstimatedHours() {
        return estimatedHours;
    }

    /**
     * Sets estimated hours.
     *
     * @param estimatedHours the estimated hours
     */
    public void setEstimatedHours(int estimatedHours) {
        if (estimatedHours == 0) {
            this.estimatedHours = DEFINED_ESTIMATED_HOURS;
        } else {
            this.estimatedHours = estimatedHours;
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
     * Gets company.
     *
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets company.
     *
     * @param company the company
     */
    public void setCompany(String company) {
        this.company = company;
    }
}
