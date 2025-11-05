package ListaEncadeadaSimples;

public class ListaEncadeadaSimples {
    Node head;

    public void addFirst(int value) {
        Node newNode = new Node(value);

        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }

    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node currNode = this.head;

            while (currNode.next != null) {
                currNode = currNode.next;
            }

            currNode.next = newNode;
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
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("");

    }

    public void removeFirst() {
        if (this.head == null) {
            System.out.println("Lista vazia");
            return;
        }

        if (this.head.next == null) {
            this.head = null;
            return;
        }

        Node tempNode = this.head.next;
        this.head = tempNode;
    }

    public void removeLast() {
        if (this.head == null) {
            System.out.println("Lista vazia");
            return;
        }

        if (this.head.next == null) {
            this.head = null;
            return;
        }
        Node currNode = this.head;
        Node prevNode = null;

        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;

        }

        prevNode.next = null;

    }

    public void searchValue(int value) {
        if (this.head == null) {
            System.out.println("Lista vazia!");
            return;
        }
        Node currNode = this.head;
        int count = 0;

        while (currNode != null) {
            if (currNode.value == value) {
                System.out.println("Número encontrado na posição " + count);
                continue;
            }
            count++;
            currNode = currNode.next;
        }

        System.out.println("Número não encontrado!");

    }

}
