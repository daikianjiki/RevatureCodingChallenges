package Week3;

/**
 * Give a ciruclar linked list, implement an algorithm that returns the node at 
 * the beginning of the loop.
 * 
 * DEFINITION:
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to
 * an earlier node, so as to make a loop in the linked list.
 * 
 * EXAMPLE:
 * Input: A -> B -> C -> E -> C (the same C as earlier)
 * Output: C
 */

public class LoopDetection {

    public static void main(String[] args) {
        Node one = new Node(3);
        Node two = new Node(5);
        Node three = new Node(9);
        
        one.next = two;
        two.next = three;
        three.next = one;

        LoopDetection loopDetection = new LoopDetection();
        Node loopStartNode = loopDetection.loopDetection(one);

        if (loopStartNode != null) {
            System.out.println("Loop detected at: " + loopStartNode.value);
        } else {
            System.out.println("No loop detected.");
        }

    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node loopDetection(Node head) {

        Node tortoise = head;
        Node hare = head;

        while (hare != null && hare.next != null) {
            tortoise  = tortoise.next;
            hare = hare.next.next;

            if (tortoise == hare) {
                break;
            }
        }

        if (hare == null || hare.next == null) {
            return null;
        }

        tortoise = head;

        while (tortoise != hare) {
            tortoise = tortoise.next;
            hare = hare.next;
        }

        return hare;
    }
}
