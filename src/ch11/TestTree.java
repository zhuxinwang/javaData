package ch11;

public class TestTree {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(15);
        tree.insert(3);

        System.out.println(tree.root.data);


        System.out.println(tree.find(0));

        Integer i = 600;
        Integer j = 600;
        System.out.println(i == j);
    }
}
