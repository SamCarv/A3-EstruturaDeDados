import java.util.Scanner;

import ListaEncadeadaSimples.ListaEncadeadaSimples;

public class Menu {

    public static void linkedList(Scanner scanner, ListaEncadeadaSimples listaEncadeadaSimples) {

        System.out.println("Lista Encadeada Simples");
        System.out.println("1 - Adicionar no inicio");
        System.out.println("2 - Adicionar no final");
        System.out.println("3 - Ver nós da lista");
        System.out.println("4 - Remover node final");
        System.out.println("5 - Remover node do começo");
        System.out.println("6 - Encontrar valor");
        System.out.print("Digite a opção desejada: ");

        int option = scanner.nextInt();
        int value;

        switch (option) {
            case 1:
                System.out.println("Digite o valor para adicionar no começo: ");
                value = scanner.nextInt();

                try {
                    listaEncadeadaSimples.addFirst(value);
                    System.out.println("Valor adicionado com sucesso!");
                } catch (Exception e) {
                    System.out.println(e);
                }

                break;

            case 2:
                System.out.println("Digite o valor para adicionar no final: ");
                value = scanner.nextInt();

                try {
                    listaEncadeadaSimples.addLast(value);
                    System.out.println("Valor adicionado com sucesso!");
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;

            case 3:
                listaEncadeadaSimples.transversal();

                break;

            case 4:
                listaEncadeadaSimples.removeLast();
                break;

            case 5:
                listaEncadeadaSimples.removeFirst();
                break;

            case 6:
                // System.out.println("Digite o valor que deseja encontrar: ");
                // value = scanner.nextInt();

                // try {
                // listaEncadeadaSimples.searchValue(value);
                // } catch (Exception e) {
                // System.out.println(e);
                // }
                break;

            default:
                break;
        }

    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeadaSimples listaEncadeadaSimples = new ListaEncadeadaSimples();
        int option = 1;

        while (option != 0) {

            System.out.println("Estruturas de Dados");
            System.out.println("-------------------");
            System.out.println("1 - Lista");
            System.out.println("2 - Pilha");
            System.out.println("3 - Fila");
            System.out.println("4 - Lista Encadeada Simples");
            System.out.println("5 - Lista Encadeada Dupla");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    linkedList(scanner, listaEncadeadaSimples);
                    break;

                case 5:

                    break;

                case 0:
                    break;

                default:
                    break;
            }
        }
        scanner.close();

    }

    public static void main(String[] args) {
        mainMenu();
    }
}
