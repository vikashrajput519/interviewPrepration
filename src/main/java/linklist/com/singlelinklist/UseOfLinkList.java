package linklist.com.singlelinklist;

public class UseOfLinkList {

    public static void main(String[] args) {

        LinkList<Integer> linkList = new LinkList<>();

        linkList.add(10);
        linkList.add(40);
        linkList.add(60);
        linkList.add(70);
        linkList.add(90);

        linkList.travers();

        System.out.println(linkList.totalSize());

        linkList.insertAtFirst(20);

        linkList.travers();

        System.out.println(linkList.totalSize());
    }
}
