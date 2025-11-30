package dev.desktop.quizgame;
import java.util.*;
/**
 *
 * @author bruceli
 */
public class QuizGame {
    public static void main(String args[]) {
        mainMenu();
    }
    public static void mainMenu() {
        ArrayList<String> messages = new ArrayList<>();
        messages.add("1. Single Player");
        messages.add("2. HotSeat");
        messages.add("3. Quit");
        System.out.println("###### QuizGame ######");
        int counter = 0;
        String fill = " ";
        while (counter <3) {
            System.out.println("# "+messages.get(counter)+fill.repeat(("###### QuizGame ######".length()-("# "+messages.get(counter)).length()-1))+"#");
            counter++;
        }
        System.out.println("######################\nChoose your gamemode:");
        boolean needed = true;
        Scanner s = new Scanner(System.in);
        while (needed) {
            System.out.print(">");
            String ans = s.nextLine();
            if (ans.replace(" ", "").matches("1")) {
                singleplayer();
                needed = false;
            }
            // todo
        }
    }
    public static void singleplayer() {
        // todo
    }
}
