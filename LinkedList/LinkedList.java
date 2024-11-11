package LinkedList; //Node sınıfı da burada 

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

    }

    public void pop() {

    }

    public void delete() {

    }
}