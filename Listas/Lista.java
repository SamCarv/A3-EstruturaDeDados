package Listas;

public class Lista {
    private int[] list;
    private int size;

    public Lista(int size) {
        this.list = new int[size];
        size = 0;
    }

    public void add(int element) {
        if (size >= list.length) {
            System.out.println("A Lista esta cheia");
            return;
        }

        list[size] = element;
        size++;
        System.out.println("Numero adicionado: " + element);
    }

    public void addNumberIn(int position, int element) {
        if (position < 0 || position > size) {
            System.out.println("Posicao fora do tamanho da Lista");
            return;
        }

        if (size >= list.length) {
            System.out.println("A Lista esta cheia");
            return;
        }

        for (int i = size - 1; i >= position; i--) {
            list[i + 1] = list[i];
        }

        list[position] = element;
        size++;
        System.out.println("Numero: '"+ element +"' adicionado na posicao: " + position);
    }

    public void remove(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Posicao fora do tamanho da Lista");
            return;
        }
        int numberRemoved = list[position];
        for (int i = position; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        size--;
        System.out.println("Numero removido: " + numberRemoved);
    }

    public void getNumber(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Posicao fora do tamanho da Lista");
            return;
        }

        System.out.println("Numero no indice " + index + ": " + list[index]);
    }

    public void printAll() {
        System.out.println("Elementos na Lista: ");
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.print("]");
    }

    public void size() {
        System.out.println("A lista tem " + size + " itens");
    }

}
