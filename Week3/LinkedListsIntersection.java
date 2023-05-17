package Week3;

/**
 * Give two (singly) liked lists, detemine if the two lists intersect.
 * Return the intersecting node. Note that the intersection is defined based on reference, not value.
 * That is, if the kth node of the ifrst linked list is the exact same node (by reference)
 * as the jth node of the second linked list, the they are intersecting.
 */

public class LinkedListsIntersection {

    public static void main(String[] args) {

        LinkedListsIntersection list = new LinkedListsIntersection();

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

        Node intersection = list.linkedListsIntersection(head1, head2);

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

    public Node linkedListsIntersection(Node head1, Node head2) {
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
