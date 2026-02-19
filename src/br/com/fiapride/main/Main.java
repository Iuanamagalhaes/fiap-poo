package br.com.fiapride.main;
import br.com.fiapride.model.Cachorro;

public class Main {

    public static void main(String[] args) {

        // Criando o primeiro objeto cachorro
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Bidu";
        cachorro1.raca = "Beagle";
        cachorro1.idade = 3;
        cachorro1.peso = 10.5;
        cachorro1.estaAcordado = true;
        cachorro1.humor = "Feliz";

        // Criando o segundo objeto cachorro
        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Lulu";
        cachorro2.raca = "Poodle";
        cachorro2.idade = 10;
        cachorro2.peso = 6.0;
        cachorro2.estaAcordado = false;
        cachorro2.humor = "Sonolenta";

        // Exibindo
        System.out.println("Cachorro: " + cachorro1.nome + " | Raça: " + cachorro1.raca + " | Idade: " + cachorro1.idade);
        System.out.println("Cachorro: " + cachorro2.nome + " | Raça: " + cachorro2.raca + " | Idade: " + cachorro2.idade);

    }
}