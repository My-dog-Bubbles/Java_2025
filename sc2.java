
import java.net.URL;
import java.util.*;

public class sc2 {

    public static void main(String[] args) {
        double total = 0.0;
        double avg = 0.0;
        int number = 0;
        int numbers = 0;
        int lines = 0;
        URL url;

        try {
            url = new URL("https://liveexample.pearsoncmg.com/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                while (input.hasNextLine()) {
                    number = input.nextInt();
                    numbers += 1;

                    total += number;
                }

                input.nextLine();
                lines += 1;
            }

        } catch (Exception incorrectURL) {
            System.out.println("The URL is formatted incorrectly.");
        }

        avg = total / numbers;

        System.out.println("Total is " + total);
        System.out.println("Average is " + avg);
    }
}
