package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testes {

    static List nomes = new ArrayList();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            leNome();
        }
        
        
        
//        System.out.println(nomes.size());
        
        for(Object obj : nomes) {
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
