package testes2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Testes2 {

    static List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) {

        Pessoa pes1 = new Pessoa("Eduardo", "Masculino");
        Pessoa pes2 = new Pessoa("Carlos", "Masculino");
        Pessoa pes3 = new Pessoa("Maria", "Feminino");

        Mulher mul = new Mulher("Joana");
        Homem hom = new Homem("Marcos");

        pessoas.add(pes1);
        pessoas.add(pes2);
        pessoas.add(pes3);

        for (Pessoa obj : pessoas) {
            System.out.println(obj.getNome());
        }

        lista();

    }

    static void lista() {
        List<String> names = new ArrayList<String>();
        
        names.add("João");
        names.add("Carlos");
        names.add("Maria");
        names.add("Pedro");
        names.add("Tiago");        

        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int num = r.nextInt((1 - 2) + 1) + 1;

            Random q = new Random();
            int num2 = q.nextInt((0 - 4) + 1) + 0;

            if (num == 1) {
                Mulher mul = new Mulher(names.get(num2));
            } else {
                Homem hom = new Homem(names.get(num2));
            }
        }

    }

}

class Pessoa {

    String nome;
    String genero;

    Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
}

class Mulher extends Pessoa {

    Mulher(String nome) {
        super(nome, "Feminino");
    }
}

class Homem extends Pessoa {

    Homem(String nome) {
        super(nome, "Masculino");
    }
}
