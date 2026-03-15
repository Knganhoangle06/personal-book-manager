public class User {
    private String name;
    private MovieLibrary library;

    public User(String name) {
        this.name = name;
        this.library = new MovieLibrary();
    }

    public void addMedia(Media media) {
        library.add(media);
    }

    public void showLibrary() {
        library.showAll();
    }

    public void suggestTopMovie() {
        library.suggestTopMovie();
    }

    public void showLastSuggestion() {
        library.showLastSuggestion();
    }
}