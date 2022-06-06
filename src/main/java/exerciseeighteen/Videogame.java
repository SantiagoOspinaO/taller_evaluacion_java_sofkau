package exerciseeighteen;

public class Videogame implements IDeliverable {

    private static final int DEFINED_ESTIMATED_HOURS = 10;
    private static final boolean DEFINED_DELIVERED = false;

    private String title;
    private int estimatedHours;
    private boolean delivered;
    private String genre;
    private String company;

    public Videogame() {
    }

    public Videogame(String title, int estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        if (estimatedHours == 0) {
            this.estimatedHours = DEFINED_ESTIMATED_HOURS;
        } else {
            this.estimatedHours = estimatedHours;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
