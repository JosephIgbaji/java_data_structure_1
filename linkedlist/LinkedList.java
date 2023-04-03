public class MyLinkedList {
    private class Node{
        private int value;
        private Node next;
        private Node(int value){
            this.value = value;
        }
    }
    Node first;
    Node last;
    public void addLast(int value){
        Node newNode = new Node(value);
        if (first == null)
            first = last = newNode;
        else {
            last.next = newNode;
            last = newNode;
        }
    }
    public void addFirst(int value){
        Node newNode = new Node(value);
        if (first == null)
            first = last = newNode;
        else{
            Node tempNode = first;
            first = newNode;
            first.next = tempNode;
        }
    }
    public int indexOf(int value){
        int index = 0;
        Node current = first;
        while (current.next != null){
            if (current.value == value)
                return index;
            current = current.next;
            index++;
        }
        if (current.value == value)
            return index;
        return -1;
    }
    public boolean contains(int value){
        Node current = first;
        while (current.next != null){
            if (current.value == value)
                return  true;
            current = current.next;
        }
        if (current.value == value)
            return  true;
        return false;
    }
    public void removeFirst(){
        Node tempNode = first;
        first = tempNode.next;
        tempNode = null;
    }
    public void removeLast(){
        Node current = first;
        if (current == last) {
            first = null;
            return;
        }
        while (current.next != last)
            current = current.next;
        current.next = null;
        last = current;
    }
    public void reverse(){
        if (first == null) return;

        Node prevNode, nextNode, currentNode;
        prevNode = null;
        currentNode = nextNode = first;
        while(nextNode != null){
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        last = first;
        first = prevNode;
    }
    public int kNodeEnd(int k) {
        if (k < 1)
            return -1;
        Node fNode, sNode;
        fNode = sNode = first;
        for (int i = 1; i < k; i++) {
            sNode = sNode.next;
            if (sNode == null)
                return -1;
        }
        while(sNode != last){
            sNode = sNode.next;
            fNode = fNode.next;
        }
        return fNode.value;
    }
    public void display(){
        Node  current = first;
        if (current == null) {
            System.out.println("List is empty");
            return ;
        }
        while (current.next != null){
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }
}