import java.util.Scanner;

import ListaEncadeadaSimples.ListaEncadeadaSimples;
import Listas.Fila;
import Listas.Pilha;

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
                System.out.println("Digite o valor que deseja encontrar: ");
                value = scanner.nextInt();

                try {
                    listaEncadeadaSimples.searchValue(value);
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;

            default:
                break;
        }

    }
    
    public static void fila(Scanner scanner) {
        System.out.println("Qual vai ser o tamanho dessa Fila ?");
        int capacity = scanner.nextInt();
        Fila fila = new Fila(capacity);
        int option = 1;
        int value;

        try {
            while (option != 0) {
                System.out.print("\n\n\n\n\n");
                System.out.println("------------------ Fila ------------------");
                System.out.println("1 - Adicionar um numero");
                System.out.println("2 - Remover o primeiro numero");
                System.out.println("3 - Buscar um numero da Fila");
                System.out.println("4 - Mostrar todos os numeros da Fila");
                System.out.println("5 - Revelar a quantidade de numeros na Fila");
                System.out.println("0 - Encerrar operacao e deletar todos os dados");
                System.out.println("------------------------------------------");
                System.out.println("Digite a opção desejada: ");
                option = scanner.nextInt();

                Thread.sleep(1000);

                switch (option) {
                    case 1:
                        System.out.println("Digite o valor para adicionar no começo: ");
                        value = scanner.nextInt();
                        fila.add(value);
                        Thread.sleep(2000);
                        break;

                    case 2:
                        fila.deleteFirstElement();
                        Thread.sleep(2000);
                        break;

                    case 3:
                        System.out.println("Digite a posicao do numero que deseja ver: ");
                        value = scanner.nextInt();
                        fila.getNumber(value);
                        Thread.sleep(2000);
                        break;

                    case 4:
                        fila.printAll();
                        Thread.sleep(2000);
                        break;

                    case 5:
                        fila.size();
                        Thread.sleep(2000);
                        break;

                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pilha(Scanner scanner) {
        System.out.println("Qual vai ser o tamanho dessa Pilha ?");
        int capacity = scanner.nextInt();
        Pilha pilha = new Pilha(capacity);
        int option = 1;
        int value;

        try {
            while (option != 0) {
                System.out.print("\n\n\n\n\n");
                System.out.println("------------------ Pilha ------------------");
                System.out.println("1 - Adicionar um numero");
                System.out.println("2 - Remover o ultimo numero");
                System.out.println("3 - Buscar ultimo numero adicionado da Pilha");
                System.out.println("4 - Mostrar todos os numeros da Pilha");
                System.out.println("5 - Revelar a quantidade de numeros na Pilha");
                System.out.println("0 - Encerrar operacao e deletar todos os dados");
                System.out.println("------------------------------------------");
                System.out.println("Digite a opção desejada: ");
                option = scanner.nextInt();

                Thread.sleep(1000);

                switch (option) {
                    case 1:
                        System.out.println("Digite o valor para adicionar no começo: ");
                        value = scanner.nextInt();
                        pilha.push(value);
                        Thread.sleep(2000);
                        break;

                    case 2:
                        pilha.pop();
                        Thread.sleep(2000);
                        break;

                    case 3:
                        pilha.peek();
                        Thread.sleep(2000);
                        break;

                    case 4:
                        pilha.printAll();
                        Thread.sleep(2000);
                        break;

                    case 5:
                        pilha.size();
                        Thread.sleep(2000);
                        break;

                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            System.out.println("2 - Fila");
            System.out.println("3 - Pilha");
            System.out.println("4 - Lista Encadeada Simples");
            System.out.println("5 - Lista Encadeada Dupla");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção desejada: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:

                    break;

                case 2:
                    fila(scanner);
                    break;

                case 3:
                    pilha(scanner);
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
