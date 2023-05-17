package May19;

public class intersection {
    public static void main(String[] args) {

        intersection list = new intersection();

        Node head1, head2;

        head1 = new Node(1);
        head2 = new Node(2);

        Node newNode = new Node(3);
        head2.next = newNode;

        newNode = new Node(4);
        head1.next = newNode;
        head2.next.next = newNode;

        newNode = new Node(5);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersection = list.intersection(head1, head2);

        if (intersection == null) {
            System.out.println("No intersection");
        } else {
            System.out.println("Intersection at : " + intersection.data);
        }
    }

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    public Node intersection(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
}

