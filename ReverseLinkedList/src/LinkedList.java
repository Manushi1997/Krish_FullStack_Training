//Reverse Linked list and checking Palindrome
public class LinkedList {

    Link head;

    public void printList() {
        Link current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void insertFirst(String value) {

        Link item = new Link(value);
        item.next = head;
        head = item;

    }

    public String removeFirst() {

        if (head != null) {
            if (head.next != null) {
                Link temp = head;
                head = head.next;
                return temp.value;
            } else {
                Link temp = head;
                head = null;
                return temp.value;
            }
        }
        return null;
    }

    public void insertLast(String value) {

        if (head != null) {
            Link current = head;
            while (current.next != null) {
                current = current.next;
            }

            Link item = new Link(value);
            current.next = item;
        } else {
            head = new Link(value);
        }

    }

    public String removeLast() {

        if (head != null) {
            Link current = head;
            Link previous = current;
            while (current.next != null) {
                previous = current;
                current = current.next;

            }

            if (current == head) {
                head = null;
                return current.value;
            }

            previous.next = null;
            return current.value;

        }

        return null;

    }

    public void reverseLinkedList() {
        reverse(head);
    }

    private void reverse(Link step) {
        if (step.next == null)
            return;
        String temp = removeFirst();
        reverse(step.next);
        insertLast(temp);

    }

    public void checkPalindrome() {
        palindrome(head);

    }

    private Link palindrome(Link step) {

        if (step.value.equals(step.next.value)) {

            return step.next.next;
        }

        if (!step.value.equals(step.next.value)) {
            Link head2 = palindrome(step.next);
            if (head2.value.equals(step.value)) {
                if (head2.value.equals(head.value)) {
                    System.out.println("The Linked List is a Palindrome!");
                }else
                    System.out.println("The Linked List is not a Palindrome!");
                return head2.next;
            }
        }

        return step.next;

    }

}
