package linklist.com.singlelinklist;

public class LinkList<T> {

    private Node<T> head;

    private Node<T> tail;

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if(null == head){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void travers(){
        Node<T> tempNode = head;

        while (true){
            if(null == tempNode){
                break;
            }else {
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    public void insertAtFirst(T data){
        Node<T> newNode = new Node<>(data);

        if(null == head){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public int totalSize(){
        int nodeSize = 0;

        Node<T> tempNode = head;

        while (true){
            if(null == tempNode){
                break;
            } else {
                tempNode = tempNode.next;
                nodeSize += 1;
            }

        }

        return nodeSize;
    }

}
