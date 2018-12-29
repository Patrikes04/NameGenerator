import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        boolean isInt = false;
        String[] letters = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        do {
            try {
                System.out.println("Write how many letters you want in your name?");
                Scanner scanner = new Scanner(System.in);
                count = scanner.nextInt();
                if( count>2 && count< 11) {
                    isInt = true;
                }else{
                    System.out.println("Your name is too short or too long, choose number between 3 and 10");
                }
            } catch (Exception e) {
                System.out.println("This is not number");
            }
        } while (!isInt);

        StringBuilder name = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            if(i==0){
                name.append(letters[rand.nextInt(26)].toUpperCase());
            }else {
                name.append(letters[rand.nextInt(26)]);
            }
            }
        System.out.println("Your name is: "+name);

    }
}