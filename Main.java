import java.util.*;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Guess whether the coin is under cup #1, #2, #3, #4 or #5 !");
        for(int magicNo = new Random().nextInt(5) + 1, guessedNo = 0 ;  (guessedNo  != magicNo)  ;  counter++) guessedNo = new Scanner(System.in).nextInt();
        System.out.println("Congratulations. It took you " + counter + " time(s) to guess it.");
    }
}
