package br.com.fiapride.model;

public class Cachorro {

    // Atributos
    private String raca, nome, humor;
    private double peso;
    private int idade;
    private boolean estaAcordado;

    public Cachorro(){
        this.setNome(nome);
        this.setRaca(raca);
        this.setHumor(humor);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setEstaAcordado(false);
    }

    public void latir(){
        if (estaAcordado == false){
            System.err.println("Erro: O cachorro está dormindo.");
            return;
        }
        System.out.println("Au!");
    }


    public void acordarCachorro(){
        if (estaAcordado == true){
            System.err.println("Erro: O cachorro já está acordado.");
            return;
        }
        setEstaAcordado(true);
        System.out.println("Cachorro acordado.");
    }


    public void verificarIdoso(){
        if(idade < 7){
            System.out.println("O cachorro tem " + idade + " anos, ainda não é idoso.");
            return;
        }
        System.out.println("O cachorro tem " + idade + " anos, já é considerado idoso.");
    }

    public void cadastrarCachorro(){

    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    private void setRaca(String raca) {
        this.raca = raca;
    }

    public String getHumor() {
        return this.humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEstaAcordado(boolean estaAcordado) {
        this.estaAcordado = estaAcordado;
    }
}


