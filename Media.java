public abstract class Media {
    protected String title;
    protected String genre;
    protected int year;
    protected double rating;
    protected boolean watched;

    public Media(String title, String genre, int year, double rating, boolean watched) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.watched = watched;
    }

    public String getTitle() {
        return title; 
    }

    public double getRating() { 
        return rating; 
    }

    public boolean isWatched() { 
        return watched; 
    }

    public void setRating(double rating) { 
        this.rating = rating; 
    }

    public void markAsWatched() { 
        watched = true; 
    }

    public abstract String getInfo();
}