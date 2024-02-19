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

    public LinkedList() {
        this.head = null;
    }

    // Method to add a number to the linked list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to display the elements of the linked list
    public void display() {
        Node current = head;

        if (current == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        System.out.println("Elements of the linked list:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class linkedlist {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Adding numbers to the linked list
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);

        // Displaying the elements of the linked list
        linkedList.display();
    }
}
