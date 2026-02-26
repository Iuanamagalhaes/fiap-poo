package br.com.fiapride.main;
import br.com.fiapride.model.Cachorro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Criando o primeiro objeto cachorro
        Cachorro cachorro1 = new Cachorro("Bidu", "Beagle","Feliz", 10.5, 3);

        cachorro1.acordarCachorro();
        cachorro1.verificarIdoso();
        cachorro1.latir();

//        Scanner scanner = new Scanner(System.in);
//        // Exibindo
//        System.out.println("Cachorro: " + cachorro1.nome + " | Raça: " + cachorro1.raca + " | Idade: " + cachorro1.idade);


    }
}