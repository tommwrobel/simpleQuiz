import java.util.Scanner;

public class simpleQuiz {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Jak masz na imię?: ");
        String name = scan.next();
        System.out.println("Witaj " + name + "!");
    }
}
