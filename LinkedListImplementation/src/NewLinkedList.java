public class NewLinkedList<T> {
    private class Node {
        T data;
        Node nextNode;

        private Node(T data) {
            this.data = data;
            nextNode = null;
        }
    }

    private Node head, tail;

    public NewLinkedList() {
        // Constructor Method in order to create the empty Linked List.
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            // This means that the Linked List is EMPTY.
            return true;
        } else {
            // We have two options: the linked list contains either at least one element or is empty. We investigated the second condition.
            // The first condition is investigated in this else condition.
            return false;
        }
    }

    public void printList() {
        // This method prints all data in the Linked List.
        Node pointer = head; // with pointer, we can scan all nodes.
        while (pointer != null) {
            System.out.println(pointer.data);
            pointer = pointer.nextNode;
        }
    }

    public int getSize() {
        Node pointer = head;
        int size = 0;
        while (pointer != null) {
            size++;
            pointer = pointer.nextNode;
        }
        return size;

    }

    public void insert(T data) {
        // This method allows inserting the data AT THE END of the Linked List.
        Node newNode = new Node(data);
        Node temp = head;
        if (isEmpty()) {
            // If the list is empty, both head and tail must point out the same node.
            head = newNode;
            tail = newNode;
        } else {
            // Otherwise, we should update the tail (the end).
            tail.nextNode = newNode;
            tail = newNode;
        }
    }

    public void insert(T data, int index) {
        // This method provides inserting data to specific index.
        Node newNode = new Node(data);
        if (isEmpty()) {
            // If the linked list is empty, we added the data at the beginning of the list regardless of the index value entered.
            head.data = data;
            tail.data = data;
        } else {
            if (getSize() <= index) {
                // If the current size of the linked list is less than the index entered, the data is added at the end of the list.
                insert(data);
            } else {
                Node temp1 = head;
                Node temp2 = null;
                for (int i = 0; i < index; i++) {
                    temp2 = temp1;
                    temp1 = temp1.nextNode;
                }
                temp2.nextNode = newNode;
                newNode.nextNode = temp1;

            }
        }
    }

    public void delete() {
        Node tempNode = head.nextNode;
        head.nextNode = null;
        head = tempNode;
    }

    public void delete(int index) {
        Node temp1 = head;
        Node temp2 = null;
        int currentSize = 0;
        if (isEmpty() == false && getSize() >= index) {
            for (int i = 0; i < index - 1; i++) {
                temp1 = temp1.nextNode;
            }
            temp1.nextNode = temp1.nextNode.nextNode;
        }
    }
}