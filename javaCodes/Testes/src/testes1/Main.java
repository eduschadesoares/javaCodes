package testes1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Estudante> nomes = new ArrayList<Estudante>();

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            leNome();
        }
        
        
        
//        System.out.println(nomes.size());
//        System.out.println(nomes.get(1));
        
        for(Estudante obj : nomes) {
            System.out.println(obj);
        }
    }

    static void leNome() {
        String nome, email;
        int RA;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Insira o nome: ");
        nome = ler.nextLine();
        System.out.printf("Insira o RA: ");
        RA = Integer.parseInt(ler.nextLine());
        System.out.printf("Insira o email: ");
        email = ler.nextLine();
        
        Estudante estudante = new Estudante(nome, email, RA);
        
        nomes.add(estudante);

    }
}
