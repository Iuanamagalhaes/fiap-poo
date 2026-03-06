package br.com.fiapride.model;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    boolean sair = false;

    public void escolhaMenu() {
        Cachorro cachorro = new Cachorro();
        while (!sair) {
            System.out.println("+______________________________________________________+");
            System.out.println("| Escolha uma opção....................................| ");
            System.out.println("| 1 - Cadastrar cachorro...............................|");
            System.out.println("| 2 - Listar cachorros.................................|");
            System.out.println("| 3 - Acordar cachorro.................................|");
            System.out.println("| 4 - Dar comandos.....................................|");
            System.out.println("| 5 - Verificar se está idoso..........................|");
            System.out.println("| 6 - Mudar nome de um cachorro........................|");
            System.out.println("| 7 - Sair.............................................|");
            System.out.println("+______________________________________________________+");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    cachorro.cadastrarCachorro();
                    break;
                case 2:
                    cachorro.listarCachoros();
                    break;
                case 3:
                    cachorro.acordarCachorro();
                    break;
                case 4:
                    System.out.println("Qual comando gostaria de dar?");
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    sair = true;
                    break;
            }
        }
    }




}
