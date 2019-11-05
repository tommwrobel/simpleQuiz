import java.util.Scanner;
import java.util.Random;

public class simpleQuiz {

    public static void main(String[] args)
    {
        Random rNum = new Random();
        Boolean win = false;
        int Result = 0;
        int qNum = rNum.nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Zgadnij liczbę z zakresu 1-100: ");
            int pNum = Integer.parseInt(scan.next());

            if(pNum == qNum)
            {
                win = true;
                Result++;
                System.out.println("Wygrales! Twój wynik to " + Result);
            }
            else if(pNum < qNum)
            {
                Result++;
                System.out.println("Podałeś za małą liczbę!");
            }
            else
            {
                Result++;
                System.out.println("Podałeś za dużą liczbę!");
            }

        } while (win == false);
    }
}
