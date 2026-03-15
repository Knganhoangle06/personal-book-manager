public class CinemaMovie extends Media {
    private int duration;
    private String language;

    public CinemaMovie(String title, String genre, int year, double rating, boolean watched, int duration, String language) {
        super(title, genre, year, rating, watched);
        this.duration = duration;
        this.language = language;
    }

    public String getInfo() {
        return "Phim le: " + title + " | The loai: " + genre + " | Nam: " + year + " | Danh gia: " + rating +
               " | Thoi luong: " + duration + " phut | Ngon ngu: " + language;
    }
}
