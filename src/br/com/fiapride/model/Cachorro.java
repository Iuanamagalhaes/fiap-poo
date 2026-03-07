package br.com.fiapride.model;

import java.util.Scanner;

public class Cachorro {
    private String raca, nome, humor;
    private double peso;
    private int idade;
    private boolean estaAcordado, estaSentado;
    private boolean cachorroCriado = false;

    Scanner scanner = new Scanner(System.in);

    public Cachorro(){
        this.setNome(nome);
        this.setRaca(raca);
        this.setHumor(humor);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setEstaAcordado(estaAcordado);
        this.setEstaSentado(estaSentado);
    }

    private boolean verificarCachorroCriado(){
        if(!cachorroCriado){
            System.err.println("Nenhum cachorro foi criado ainda! Cadastre um primeiro.");
            return false;
        }
        return true;
    }

    public void latir() {
        if(!verificarCachorroCriado()){
            return;
        }
        if (!estaAcordado) {
            System.err.println("O cachorro está dormindo agora, tente acordá-lo primeiro.");
            return;
        }
        System.out.println("Au! ૮₍´｡ᵔ ꈊ ᵔ｡`₎ა");
    }

    public void sentar() {
        if(!verificarCachorroCriado()){
            return;
        }
        if (!estaAcordado) {
            System.err.println("O cachorro está dormindo agora, tente acordá-lo primeiro.");
            return;
        }
        if (estaSentado) {
            System.err.println("O cachorro já está sentado, tente dar o comando LEVANTAR primeiro.");
            return;
        }
        estaSentado = true;
        System.out.println("O cachorro sentou. ૮˶- ﻌ -˶ა⌒)ᦱ");
    }

    public void levantar() {
        if(!verificarCachorroCriado()){
            return;
        }
        if (!estaAcordado) {
            System.err.println("O cachorro está dormindo agora, tente acordá-lo primeiro.");
            return;
        }
        if (!estaSentado) {
            System.err.println("O cachorro já está em pé, tente dar o comando SENTAR primeiro.");
            return;
        }
        estaSentado = false;
        System.out.println("O cachorro levantou. ૮⍝• ᴥ •⍝ა");
    }

    public void acordarCachorro() {
        if(!verificarCachorroCriado()){
            return;
        }
        if (estaAcordado) {
            System.err.println("O cachorro já está acordado!");
            return;
        }
        setEstaAcordado(true);
        System.out.println("O cachorro acordou. ૮･ﻌ･ა");
    }

    public void verificarIdoso() {
        if(!verificarCachorroCriado()){
            return;
        }
        if (idade < 7) {
            System.out.println(nome + " tem " + idade + " anos, ainda não é idoso.");
            return;
        }
        System.out.println(nome + " tem " + idade + " anos, já é considerado idoso.");
    }

    public void mudarNomeCachorro(String novoNome) {
        if(!verificarCachorroCriado()){
            return;
        }
        if (novoNome == null || novoNome.isBlank()) {
            System.err.println("Informe um nome válido.");
            return;
        }
        setNome(novoNome);
        System.out.println("Agora o cachorro se chama: " + novoNome);
    }

    public void cadastrarCachorro() {
        System.out.println("+______________________________________________________+");
        while (true) {
            System.out.print("| Digite o nome do cachorro: ");
            String entrada = scanner.nextLine();
            if (!entrada.isBlank()) {
                setNome(entrada);
                break;
            }
            System.err.println("Nome inválido, informe um valor!");
        }
        while (true) {
            System.out.print("| Digite a raça do cachorro: ");
            String entrada = scanner.nextLine();
            if (!entrada.isBlank()) {
                setRaca(entrada);
                break;
            }
            System.err.println("Raça inválida, informe um valor!");
        }
        while (true) {
            System.out.print("| Como ele está se sentindo agora?: ");
            String entrada = scanner.nextLine();
            if (!entrada.isBlank()) {
                setHumor(entrada);
                break;
            }
            System.out.println("Humor inválido, informe um valor!");
        }
        while (true) {
            System.out.print("| Digite o peso do cachorro: ");
            if (scanner.hasNextDouble()) {
                double peso = scanner.nextDouble();
                if (peso > 0) {
                    setPeso(peso);
                    scanner.nextLine();
                    break;
                }
            }
            System.out.println("Peso inválido, informe um valor coerente!");
            scanner.nextLine();
        }
        while (true) {
            System.out.print("| Digite a idade do cachorro: ");
            if (scanner.hasNextInt()) {
                int idade = scanner.nextInt();
                if (idade >= 0 && idade <= 18) {
                    setIdade(idade);
                    scanner.nextLine();
                    break;
                }
            }
            System.out.println("Idade inválida, informe um valor entre 0 e 18!");
            scanner.nextLine();
        }
        while (true) {
            System.out.print("| O cachorro está acordado agora? (S/N): ");
            String estadoAcordado = scanner.nextLine().trim().toUpperCase();
            if (estadoAcordado.equals("S")) {
                setEstaAcordado(true);
                break;
            }
            if (estadoAcordado.equals("N")) {
                setEstaAcordado(false);
                break;
            }
            System.out.println("Responda apenas com S ou N.");
        }
        while (true) {
            System.out.print("| O cachorro está sentado agora? (S/N): ");
            String estadoSentado = scanner.nextLine().trim().toUpperCase();
            if (estadoSentado.equals("S")) {
                setEstaSentado(true);
                break;
            }
            if (estadoSentado.equals("N")) {
                setEstaSentado(false);
                break;
            }
            System.out.println("Responda apenas com S ou N.");
        }
        cachorroCriado = true;
        System.out.println("Cachorro cadastrado com sucesso! ᐡ ᐧ ﻌ ᐧ ᐡ");
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

    public void setEstaSentado(boolean estaSentado) {
        this.estaSentado = estaSentado;
    }
}