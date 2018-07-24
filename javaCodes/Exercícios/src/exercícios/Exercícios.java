package exercícios;

public class Exercícios {

    public static void main(String[] args) {
        um();
        dois();
        tres();
        quatro();
        cinco();
        seis();
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

}
