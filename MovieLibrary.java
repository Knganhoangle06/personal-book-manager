public class MovieLibrary {
    private Media[] mediaList;
    private int count;
    private Media lastSuggested;

    public MovieLibrary() {
        mediaList = new Media[100];
        count = 0;
        lastSuggested = null;
    }

    public void add(Media media) {
        if (count < mediaList.length) {
            mediaList[count++] = media;
            System.out.println("Da luu phim \"" + media.getTitle() + "\" vao thu vien.\n");
        }
    }

    public void showAll() {
        System.out.println("Danh sach phim da luu:");
        if (count == 0) {
            System.out.println("(Chua co phim nao)");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(mediaList[i].getInfo());
        }
    }

    public void suggestTopMovie() {
        Media best = null;
        for (int i = 0; i < count; i++) {
            if (mediaList[i].getRating() >= 9.0) {
                if (best == null || mediaList[i].getRating() > best.getRating()) {
                    best = mediaList[i];
                }
            }
        }
        if (best != null) {
            System.out.println("Phim co danh gia cao nhat (>= 9.0):");
            System.out.println(best.getInfo());
            lastSuggested = best;
        } else {
            System.out.println("Khong co phim nao du tieu chi (>= 9.0) de goi y.");
        }
    }

    public void showLastSuggestion() {
        if (lastSuggested != null) {
            System.out.println("Phim duoc goi y gan nhat:");
            System.out.println(lastSuggested.getInfo());
        } else {
            System.out.println("Chua co phim nao duoc goi y.");
        }
    }
}