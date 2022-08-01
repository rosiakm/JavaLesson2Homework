import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {
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
            case 10:
            case 15:
                for (int i = 0; i < size; i++) {
                    charList.add(i, createBaseList().get(random.nextInt(createBaseList().size())));
                }
                String token = charList.toString().
                        replaceAll(", ", "").
                        substring(1, charList.size() + 1);
                System.out.println(token);

                break;
            default:
                System.out.println("You can choose only between 5, 10 and 15");
        }
    }

    public static List<Character> createBaseList() {
        List<Character> baseList = new ArrayList<>();

        //adding lowercases
        for (int i = 97; i < 123; i++) {
            baseList.add((char) i);
        }
        //adding uppercases
        for (int i = 65; i < 91; i++) {
            baseList.add((char) i);
        }
        //adding numbers
        for (int i = 48; i < 58; i++) {
            baseList.add((char) i);
        }
        //adding special signs
        for (int i = 33; i < 43; i++) {
            baseList.add((char) i);
        }
        baseList.add((char) 64);
        baseList.add((char) 94);
        return baseList;
    }
}
