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
            System.out.println("| 2 - Acordar cachorro.................................|");
            System.out.println("| 3 - Dar comandos.....................................|");
            System.out.println("| 4 - Verificar se está idoso..........................|");
            System.out.println("| 5 - Mudar nome do cachorro...........................|");
            System.out.println("| 6 - Sair.............................................|");
            System.out.println("+______________________________________________________+");
            System.out.print("Escolha: ");
            int escolhaMenuPrincipal = scanner.nextInt();

            switch (escolhaMenuPrincipal) {
                case 1:
                    cachorro.cadastrarCachorro();
                    break;
                case 2:
                    cachorro.acordarCachorro();
                    break;
                case 3:
                    System.out.println("+______ CENTRAL DE COMANDOS ______+");
                    System.out.println("| 1 - Latir.......................|");
                    System.out.println("| 2 - Sentar......................|");
                    System.out.println("| 3 - Levatar.....................|");
                    System.out.print("| Qual comando gostaria de dar? ");
                    int esolhaMenuComandos = scanner.nextInt();

                    switch (esolhaMenuComandos) {
                        case 1:
                            cachorro.latir();
                            break;
                        case 2:
                            cachorro.sentar();
                            break;
                        case 3:
                            cachorro.levantar();
                            break;

                    }

                    break;
                case 4:
                    cachorro.verificarIdoso();
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.print("| Qual será o novo nome do cachorro? ");
                    String novoNome = scanner.nextLine();
                    cachorro.mudarNomeCachorro(novoNome);
                    break;
                case 6:
                    sair= true;
                    break;
            }
        }
    }




}
