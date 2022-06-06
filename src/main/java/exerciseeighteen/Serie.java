package exerciseeighteen;

public class Serie implements IDeliverable {

    private static final int DEFINED_NUMBER_SEASONS = 3;
    private static final boolean DEFINED_DELIVERED = false;

    private String title;
    private int numberSeasons;
    private boolean delivered;
    private String genre;
    private String creator;

    public Serie() {
    }

    public Serie(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberSeasons() {
        return numberSeasons;
    }

    public void setNumberSeasons(int numberSeasons) {
        if (numberSeasons == 0) {
            this.numberSeasons = DEFINED_NUMBER_SEASONS;
        } else {
            this.numberSeasons = numberSeasons;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
