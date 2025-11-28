package Listas;

public class Fila {
    // FIFO
    private int frente = 0;
    private int fim = -1;
    private int size = 0;
    private int[] list;
    private int capacity;

    public Fila(int capacity) {
        this.list = new int[capacity];
        this.capacity = capacity;
    }

    public void add(int number) {
        if (size == capacity) {
            System.out.println("A fila esta cheia");
            return;
        }

        fim = (fim + 1) % capacity;
        list[fim] = number;
        size++;

        System.out.println("Numero adicionado: " + number);
    }

    public void removeFirstElement() {
        if (size == 0) {
            System.out.println("A fila esta vazia");
            return;
        }

        int deletedNumber = list[frente];
        frente = (frente + 1) % capacity;
        size--;

        System.out.println("Numero deletado: " + deletedNumber);
    }

    public void getNumber(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Esse índice esta fora do range da fila");
            return;
        }

        int realIndex = (frente + index) % capacity;
        System.out.println("Numero no indice " + index + ": " + list[realIndex]);
    }

    public void size() {
        System.out.println("A fila tem " + size + " elementos");
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("A fila esta vazia");
            return;
        }

        System.out.println("Elementos na Fila:");
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            int realIndex = (frente + i) % capacity;
            System.out.print(list[realIndex]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.print("]");
    }
}
