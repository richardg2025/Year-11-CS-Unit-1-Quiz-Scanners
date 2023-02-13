import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {

        // 1.
        Scanner scanner = new Scanner(System.in);

        // 2.
        System.out.println("Please enter your first name: ");

        // 3.
        String firstName = scanner.next();

        // 4.
        System.out.println("Please enter your last name: ");

        // 5.
        String lastName = scanner.next();

        // 6.
        System.out.println("Please enter your age: ");

        // 7.
        int age = scanner.nextInt();

        // 8.
        System.out.println("Please enter your favorite song: ");

        // 9.
        String favSong = scanner.next();

        // 10.
        String info = "Hi, my name is " + firstName + " " + lastName + ". I am " + age + " years old and my favourite song is " + favSong + ".";

        // 11.
        System.out.println(info);

        // 12.
        scanner.close();

    }
}
