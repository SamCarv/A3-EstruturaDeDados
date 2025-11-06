package Listas;

public class Pilha {
    // LIFO
    private int topo;
    private int[] list;
    private int capacity;

    public Pilha(int capacity) {
        this.capacity = capacity;
        this.list = new int[capacity];
        this.topo = -1;
    }

    public void push(int number) {
        if (topo == capacity - 1) {
            System.out.println("A pilha esta cheia");
            return;
        }
        list[++topo] = number;
        System.out.println("Numero adicionado a pilha: " + number);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("A pilha esta vazia");
            return;
        }
        int removed = list[topo--];
        System.out.println("Numero removido da pilha: " + removed);
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("A pilha esta vazia");
            return;
        }
        System.out.println("Topo da pilha: " + list[topo]);
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public void size() {
        System.out.println("A pilha contem " + (topo + 1) + " elementos");
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("A pilha esta vazia");
            return;
        }
        System.out.print("Elementos na pilha: ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}