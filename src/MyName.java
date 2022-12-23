import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {
        System.out.println("Please Enter your name:");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("Hello , Your name is V" + name);
    }

}
