package dev.desktop.quizgame;
import java.util.*;
/**
 *
 * @author bruceli
 */
// gameplay has attackers who choose the question out
// of 4 possible randomily selected questions
// and the defender will answer them.
// if defender gets it wrong attacker gets point
// if defender gets it right than role swap
// only attackers can earn points
// first to 10 wins
// all questions are 4 option multiple choice.
// posible scripting language later to add more questions and
// allow users to create their own questions.

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
	// different ai levels will have different 
	// chances of getting questions right
	// eg hard difficulty:50%, normal difficulty:33%,
	// easy difficulty:25%. no matter what difficulty, 
	// however, when the ai is the attacker it will 
	// randomly choose any of the four available questions.
    public static void singleplayer() {
        int playerScore = 0;
        int botScore = 0;
       	Scanner s = new Scanner(System.in);
        Random random = new Random();
        int order = random.nextInt(2)
        System.out.println("Select Difficulty: \n1. Normal\n2.Hard\n3. Easy");
        System.out.print(">");
        String difficulty = s.nextLine();
        while (playerScore<= 10 && botScore <= 10){
            // todo 
        }
    }
    public static void readQFile(File file) {

    }
}
