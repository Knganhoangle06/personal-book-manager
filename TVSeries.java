public class TVSeries extends Media {
    private int seasons;
    private String platform;

    public TVSeries(String title, String genre, int year, double rating, boolean watched, int seasons, String platform) {
        super(title, genre, year, rating, watched);
        this.seasons = seasons;
        this.platform = platform;
    }

    @Override
    public String getInfo() {
        return "Phim bo: " + title + " | The loai: " + genre + " | Nam: " + year + " | Danh gia: " + rating +
               " | So mua: " + seasons + " | Nen tang: " + platform;
    }
}