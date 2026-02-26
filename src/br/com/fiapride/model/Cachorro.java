package br.com.fiapride.model;

public class Cachorro {

    // Atributos
    public String raca, nome, humor;
    public double peso;
    public int idade;
    public boolean estaAcordado;

    public Cachorro(String nome, String raca, String humor, double peso, int idade){
        this.nome = nome;
        this.raca = raca;
        this.humor = humor;
        this.peso = peso;
        this.idade = idade;
        this.estaAcordado = false;
    }

    public void latir(){
        if (estaAcordado == false){
            System.out.println("Erro: O cachorro está dormindo.");
            return;
        }
        System.out.println("Au!");
    }

    public void acordarCachorro(){
        if (estaAcordado == true){
            System.out.println("Erro: o cachorro já está acordado.");
            return;
        }
        this.estaAcordado = true;
        System.out.println("Acordei");
    }

    public void verificarIdoso(){
        if(idade < 7){
            System.out.println("O cachorro tem " + idade + " anos, ainda não é idoso.");
            return;
        }
        System.out.println("O cachorro tem " + idade + " anos, já é considerado idoso.");
    }

}


