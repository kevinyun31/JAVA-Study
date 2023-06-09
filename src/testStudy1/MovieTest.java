package testStudy1;

import java.util.Scanner;

class Movie {
    String title, director;
    static int count;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        count++;
    }
}

public class MovieTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Movie[] list = new Movie[10];
        list[0] = new Movie("백튜더퓨처", "멋진 감독");
        list[1] = new Movie("백튜더퓨처2", "잘생긴 감독");
        list[2] = new Movie("백튜더퓨처3", "시크한 감독");

        for (int i = 0; i < Movie.count; i++) {
            System.out.println("=====================");
            System.out.println("제목: " + list[i].title);
            System.out.println("감독: " + list[i].director);
            System.out.println("=====================");

        }
    }
}
