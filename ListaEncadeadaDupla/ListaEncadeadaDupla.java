package ListaEncadeadaDupla;

public class ListaEncadeadaDupla {
    Node head;
    Node tail;

    public void addFirst(int value) {
        Node newNode = new Node(value);

        if (this.head == null) {
            this.head = this.tail = newNode;

        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }

    }

    public void addLast(int value) {
        Node newNode = new Node(value);

        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }

    }

    public void transversal() {
        if (this.head == null) {
            System.out.println("Lista vazia");
            return;
        }

        Node tempNode = head;

        System.out.println("");
        while (tempNode != null) {
            System.out.print(tempNode.value + " <-> ");
            tempNode = tempNode.next;
        }
        System.out.println("");

    }

    public void removeFirst() {
        if (this.head == null) {
            System.out.println("Lista vazia");
            return;
        }

        if (this.head == this.tail) {
            this.head = this.tail = null;
            return;
        }

        this.head = this.head.next;
        this.head.prev = null;
    }

    public void removeLast() {
        if (this.head == null) {
            System.out.println("Lista vazia");
            return;
        }

        if (this.head == this.tail) {
            this.head = this.tail = null;
            return;
        }

        this.tail = this.tail.prev;
        this.tail.next = null;

    }

    public void searchValue(int value) {
        if (this.head == null) {
            System.out.println("Lista vazia!");
            return;
        }
        Node currNode = this.head;
        int count = 0;
        boolean found = false;

        while (currNode != null) {
            if (currNode.value == value) {
                System.out.println("Número encontrado na posição " + count);
                found = true;
                break;
            }
            count++;
            currNode = currNode.next;
        }

        if (!found) {
            System.out.println("Número não encontrado!");
        }

    }
}
