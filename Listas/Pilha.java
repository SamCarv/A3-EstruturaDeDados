package Listas;

public class Pilha {
    // LIFO
    private int topo;
    private int[] list;
    private int size;

    public Pilha(int size) {
        this.size = size;
        this.list = new int[size];
        this.topo = -1;
    }

    public void push(int number) {
        if (topo == size - 1) {
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
        int removed = list[topo];
        topo--;
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

        System.out.println("Elementos na Pilha: ");
        System.out.print("[");
        for (int i = 0; i <= topo; i++) {
            System.out.print(list[i]);
            if (i <= topo - 1) System.out.print(", ");
        }
        System.out.print("]");
    }
}