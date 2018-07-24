package exercícios;

import java.util.Scanner;

public class Exercícios {

    public static void main(String[] args) {
        um();
        dois();
        tres();
        quatro();
        cinco();
        seis();
        sete();
        oito();
        nove();
        dez();
        onze();
    }

    static void um() {
        System.out.print("1 - ");
        for (int i = 0; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static void dois() {
        System.out.print("2 - ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static void tres() {
        System.out.print("3 - ");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static void quatro() {
        System.out.print("4 - ");
        for (int i = 100; i <= 200; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static void cinco() {
        System.out.print("5 - ");
        for (int i = 200; i >= 100; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static void seis() {
        System.out.print("6 - ");
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    static void sete() {
        System.out.print("7 - ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    static void oito() {
        System.out.print("8 - ");
        int i = 0, counter = 0;
        while (true) {
            if (counter == 100) {
                break;
            } else if (i % 2 != 0) {
                System.out.print(i + " ");
                counter += 1;
            }
            i += 1;
        }
        System.out.println("");
    }

    static void nove() {
        System.out.print("9 - ");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println("");
    }

    static void dez() {
        System.out.print("10 - ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    static void onze() {
        Scanner num = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Num: ");
            float n = num.nextFloat();
            System.out.println("Res: " + (n / 2));
        }
    }
}
