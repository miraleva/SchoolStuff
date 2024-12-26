package ContactBstHw;



public class Main {
    public static void main(String[] args) {
        Tree testTree = new Tree();
        testTree.add("Mahmet", "123");
        testTree.add("Ahmet", "234");
        testTree.add("Zahmet", "456");

        System.out.println(testTree.root.name);
        System.out.println(testTree.root.left.name);
        System.out.println(testTree.root.right.name);

        System.out.println(testTree.search("Zahmet"));
        System.out.println(testTree.search("Cahmet"));

        testTree.add("Kahmet", "567");
        System.out.println(testTree.root.phone);

        testTree.show(testTree.root);

        testTree.delete("Mahmet");

        System.out.println(testTree.search("Mahmet"));

    }
}
