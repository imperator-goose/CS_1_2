import java.util.Random;
import java.util.Scanner;

public class CS_2_2 {

        static Random rn = new Random();
        public static boolean stopper;
        public static int win = rn.nextInt(100 - 1 + 1) + 1;
        public static Scanner scanner = new Scanner(System.in);;

        public static void main(String[] args) {
            check();
        }

        public static void check() {

            System.out.println("Введите число от 1 до 100");

            int x = scanner.nextInt();

            stopper = false;
            while (!stopper) {
                if (x == win) {
                    System.out.println("Вы угадали!");
                    stopper = true;
                    break;
                } else if (x < win) {
                    System.out.println("Ваше число меньше");
                } else if (x > win) {
                    System.out.println("Ваше число больше");
                }

                x = scanner.nextInt();
            }
        }

}