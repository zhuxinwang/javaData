package ch04;

public class TestLinkList {
    public static void main(String[] args) {

        LinkList linkList = new LinkList();

        linkList.insertFirst(32);
        linkList.insertFirst(23);
        linkList.insertFirst(2);

        linkList.display();

        linkList.deleteFirst();

        linkList.display();


        Node node = linkList.find(23);
        node.display();
    }
}
