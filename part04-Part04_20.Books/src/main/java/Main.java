  
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Books(title, pages, year));
        }

        System.out.println();
        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();

        for (Books book : books) {
            if (answer.equals("everything")) {
                System.out.println(book.toString());
            } else if (answer.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}