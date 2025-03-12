package doublylinklist;

public class DoublyLinkList<T> {

    Node<T> head;

    Node<T> tail;

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if(null == head){
            head = newNode;
        }else {
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display(){
        Node<T> tempNode = head;

        while (tempNode != null){
            System.out.print(tempNode.data+" ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
