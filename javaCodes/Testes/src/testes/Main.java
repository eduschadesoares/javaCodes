package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> nomes = new ArrayList<String>();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            leNome();
        }
        
        
        
//        System.out.println(nomes.size());
//        System.out.println(nomes.get(1));
        
        for(String obj : nomes) {
            System.out.println(obj);
        }
    }

    static void leNome() {
        String nome;
        System.out.printf("Insira um nome: ");
        Scanner ler = new Scanner(System.in);
        nome = ler.nextLine();
        nomes.add(nome);

    }
}
