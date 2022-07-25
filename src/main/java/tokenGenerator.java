import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class tokenGenerator {
    public static void main(String[] args) {
        //declaration of new list to store the random characters
        List<Character> charList = new ArrayList<>();
        //new random object
        Random random = new Random();

        //Scanner as an option for user to choose the size of the token
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size of token do you need? 5, 10 or 15?");
        int size = scanner.nextInt();

        switch (size) {
            case 5:
                for (int i = 0; i < 5; i++) {
                    charList.add(i, (char) (random.nextInt(122 - 33)+33));
                }
                String shortToken = charList.toString().replaceAll(", ", "").substring(1,6);
                System.out.println(shortToken);

                break;
            case 10:
                for (int i = 0; i < 10; i++) {
                    charList.add(i, (char) (random.nextInt(122 - 33)+33));
                }
                    String mediumToken = charList.toString().replaceAll(", ", "").substring(1, 11);
                    System.out.println(mediumToken);
                break;
            case 15:
                for (int i = 0; i < 15; i++) {
                    charList.add(i, (char) (random.nextInt(122 - 33)+33));
                }
                    String longToken = charList.toString().replaceAll(", ", "").substring(1, 16);
                    System.out.println(longToken);
                break;
            default:
                System.out.println("You can choose only between 5, 10 and 15");
        }
    }
}
