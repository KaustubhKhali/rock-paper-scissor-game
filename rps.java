import java.util.Random;
import java.util.Scanner;

public class rps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = 0;
        System.out.println("enter 5 values");

        for(int i = 0; i < 5; ++i) {
            System.out.println("Enter 1 for rock 2 for paper 3 for sissors");
            user = sc.nextInt();
            Random r = new Random();
            int low = 1;
            int high = 4;
            int result = r.nextInt(high - low) + low;
            System.out.println(result);
            if (result == user) {
                System.out.println("draw");
            } else if (user == 1) {
                if (result == 2) {
                    System.out.println("pc win as it chose paper");
                } else {
                    System.out.println("you wins as pc chose sissor");
                }
            } else if (user == 2) {
                if (result == 1) {
                    System.out.println("you win as pc chose rock");
                } else {
                    System.out.println("pc wins as it chose sissors");
                }
            } else if (user == 3) {
                if (result == 1) {
                    System.out.println("pc wins as it chose rock");
                } else {
                    System.out.println("you win as pc chose paper");
                }
            } else {
                System.out.println("wrong choice");
            }
        }

    }
}
