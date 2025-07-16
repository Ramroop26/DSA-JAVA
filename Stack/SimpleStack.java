public class SimpleStack {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to create stack manually
    static Node createStack() {
        Node first = new Node(11);
        Node second = new Node(12);
        Node third = new Node(13);

        // Linking like: top -> 13 -> 12 -> 11
        third.next = second;
        second.next = first;

        return third; // top of the stack
    }

    // Function to display the stack
    static void display(Node top) {
        System.out.println("Stack elements:");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        Node top = createStack(); // Create stack
        display(top);             // Show stack
    }
}
