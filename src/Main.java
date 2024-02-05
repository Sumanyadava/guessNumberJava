import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1 ;

        Scanner sc = new Scanner(System.in);


        System.out.println("choose number of attempt");
        int attempt = sc.nextInt();

        System.out.println("enter guess 1 to 10 ");

        int tryCount = 1;

        while ( attempt!=0) {
            int Guess = sc.nextInt();
//            System.out.println(randomNumber);
            if (Guess == randomNumber) {
                System.out.println("Correct ! ");
                System.out.println("you completed the attempt in "+ tryCount+" attempt");
                break;
            } else if (randomNumber > Guess) {
                System.out.println("Guess higher");

            } else {
                System.out.println("Guess lower");

            }
            attempt -= 1;
            System.out.println("\nyou have "+ attempt + " attempt\n");
            tryCount++ ;
        }

        sc.close();
    }
}