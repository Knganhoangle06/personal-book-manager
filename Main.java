import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User user = new User("Mai");

        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Them phim moi");
            System.out.println("2. Hien thi phim da luu");
            System.out.println("3. Goi y phim co danh gia cao (>= 9.0)");
            System.out.println("4. Hien thi goi y gan nhat");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("1. Phim le | 2. Phim bo: ");
                    int type = in.nextInt();
                    in.nextLine();

                    System.out.print("Nhap ten phim: ");
                    String title = in.nextLine();
                    System.out.print("Nhap the loai: ");
                    String genre = in.nextLine();
                    System.out.print("Nhap nam phat hanh: ");
                    int year = in.nextInt();
                    System.out.print("Nhap diem danh gia: ");
                    double rating = in.nextDouble();
                    in.nextLine();

                    if (type == 1) {
                        System.out.print("Nhap thoi luong (phut): ");
                        int duration = in.nextInt();
                        in.nextLine();
                        System.out.print("Nhap ngon ngu: ");
                        String language = in.nextLine();
                        CinemaMovie movie = new CinemaMovie(title, genre, year, rating, false, duration, language);
                        user.addMedia(movie);
                    } else {
                        System.out.print("Nhap so mua: ");
                        int seasons = in.nextInt();
                        in.nextLine();
                        System.out.print("Nhap nen tang: ");
                        String platform = in.nextLine();
                        TVSeries series = new TVSeries(title, genre, year, rating, false, seasons, platform);
                        user.addMedia(series);
                    }
                    break;
                case 2:
                    user.showLibrary();
                    break;
                case 3:
                    user.suggestTopMovie();
                    break;
                case 4:
                    user.showLastSuggestion();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh  ");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 0);
    }
}