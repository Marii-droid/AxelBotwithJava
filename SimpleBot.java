package bot;

import java.util.Random;
import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Axel", "2024"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Yo! I'm " + assistantName + ".");
        System.out.println("You created me in " + birthYear + ".");
        System.out.println("Tell me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println( name + ", I've got you memorized.");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("You're " + age + " years old; that's good enough for me.");
    }

    static void count() {
        System.out.println("I've got a surprise, I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Now let's play a game.");
        // write your code here
        System.out.println("Who is the best Kingdom Hearts character?");
        System.out.println("1. Roxas.");
        System.out.println("2. Sora.");
        System.out.println("3. Axel");
        System.out.println("4. Riku.");
        String answer = scanner.next();
        int answerInt = Integer.parseInt(answer);
        if (answerInt != 3) {
            System.out.println("Eh wrong, guess again.");
            answerInt = scanner.nextInt();
        } else end();
        }


    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
