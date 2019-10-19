/*Part 1

package ritchbasic;

import java.util.Scanner;
import java.util.*;
import java.security.SecureRandom;

class Part1 {
static Scanner sc = new Scanner(System.in);

private static void askQuestion() {
 SecureRandom r = new SecureRandom();
 int x = r.nextInt(9) + 1; // range of 1 through 9
 int y = r.nextInt(9) + 1; // range of 1 through 9
 int ans = -1;
 do {
     System.out.printf("How much is %d times %d? ", x, y);
     ans = sc.nextInt();
 } while (ans != x * y);
}

public static void main(String[] args) {
 while (true) {
     askQuestion();
 }
}

}
*/


/* Part 2
package ritchbasic;

import java.security.SecureRandom;
import java.util.Scanner;

public class Part2 {

    static Scanner sc = new Scanner(System.in);

    private static void askQuestion() {
        SecureRandom r = new SecureRandom();
        int x = r.nextInt(9) + 1; // range of 1 through 9
        int y = r.nextInt(9) + 1; // range of 1 through 9
        int ans = -1;
        do {
            System.out.printf("How much is %d times %d? ", x, y);
            ans = sc.nextInt();
            int response = r.nextInt(4) + 1;
            if (ans != x * y) {
                switch (response) {
                    case 1:
                        System.out.println("Very good!");
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice work");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }
            } else {
                switch (response) {
                    case 1:
                        System.out.println("No. Please try again.");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. keep trying.");
                        break;
                }
            }
        } while (ans != x * y);
    }

    public static void main(String[] args) {
        while (true) {
            askQuestion();
        }
    }
}

 */

/* package ritchbasic;

import java.security.SecureRandom;
import java.util.Scanner;

public class Part3 {

    static Scanner sc = new Scanner(System.in);

    private static boolean askQuestion() {
        SecureRandom r = new SecureRandom();
        int x = r.nextInt(9) + 1; // range of 1 through 9
        int y = r.nextInt(9) + 1; // range of 1 through 9
        int ans = -1;

        System.out.printf("How much is %d times %d? ", x, y);
        ans = sc.nextInt();
        int response = r.nextInt(4) + 1;
        if (ans != x * y) {
            switch (response) {
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }
        return ans == x * y;
    }

    public static void main(String[] args) {
        int correct = 0;
        for (int i = 0; i < 10; i++)
            if (askQuestion())
                correct++;
        double percent = (double) correct / 10;
        System.out.println(percent < 0.75 ? "Please ask your teacher for extra help."
                : "Congratulations, you are ready to go to the next level.");
    }
}

*/


/*

package ritchbasic;
import java.security.SecureRandom;
import java.util.Scanner;

public class Part4 {

    static Scanner sc = new Scanner(System.in);
    static int diff;

    private static boolean askQuestion() {
        SecureRandom r = new SecureRandom();
        int bound = (int) (Math.pow(10, diff) - 1);
        int x = r.nextInt(bound) + 1; // range of 1 through 9
        int y = r.nextInt(bound) + 1; // range of 1 through 9
        int ans = -1;

        System.out.printf("How much is %d times %d? ", x, y);
        ans = sc.nextInt();
        int response = r.nextInt(4) + 1;
        if (ans != x * y) {
            switch (response) {
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }
        return ans == x * y;
    }

    public static void main(String[] args) {
        System.out.print("Enter a difficulty: ");
        diff = sc.nextInt();
        int correct = 0;
        for (int i = 0; i < 10; i++)
            if (askQuestion())
                correct++;
        double percent = (double) correct / 10;
        System.out.println(percent < 0.75 ? "Please ask your teacher for extra help."
                : "Congratulations, you are ready to go to the next level.");
    }
}
 */


import java.security.SecureRandom;
import java.util.Scanner;

public class Cuvier_p1 {

    static Scanner sc = new Scanner(System.in);
    static int diff;
    static int type;

    private static boolean askQuestion() {
        SecureRandom r = new SecureRandom();
        int bound = (int) (Math.pow(10, diff) - 1);
        int x = r.nextInt(bound) + 1; // range of 1 through 9
        int y = r.nextInt(bound) + 1; // range of 1 through 9
        int ans = -100;
        double expectedAns = -100;
        switch (type) {
            case 1:
                System.out.printf("How much is %d plus %d? ", x, y);
                expectedAns = x + y;
                break;
            case 2:
                System.out.printf("How much is %d minus %d? ", x, y);
                expectedAns = x - y;
                break;
            case 3:
                System.out.printf("How much is %d times %d? ", x, y);
                expectedAns = x * y;
                break;
            case 4:
                System.out.printf("How much is %d divided by %d? ", x, y);
                expectedAns = (double) x / y;
                break;
        }
        ans = sc.nextInt();
        int response = r.nextInt(4) + 1;
        if (ans == expectedAns) {
            switch (response) {
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }
        return ans == expectedAns;
    }

    public static void main(String[] args) {
        System.out.print("Enter a difficulty: ");
        diff = sc.nextInt();
        System.out.println("Enter a type of problem (1-addition, 2-subtraction 3-multiplication, 4-division, 5-mix: ");
        type = sc.nextInt();
        int correct = 0;
        for (int i = 0; i < 10; i++)
            if (askQuestion())
                correct++;
        double percent = (double) correct / 10;
        System.out.println(percent < 0.75 ? "Please ask your teacher for extra help."
                : "Congratulations, you are ready to go to the next level.");
    }
}