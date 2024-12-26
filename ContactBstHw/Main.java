package ContactBstHw;



public class Main {
    public static void main(String[] args) {
        Tree testTree = new Tree();
        testTree.add("Fatih", "123");
        testTree.add("Ahmet", "234");
        testTree.add("Zeliha", "456");

        System.out.println(testTree.root.name);
        System.out.println(testTree.root.left.name);
        System.out.println(testTree.root.right.name);

        System.out.println(testTree.search("Zeliha"));
        System.out.println(testTree.search("Cihan"));

        testTree.add("Mehmet", "567");
        System.out.println(testTree.root.phone);

        testTree.show(testTree.root);

        testTree.delete("Fatih");

        System.out.println(testTree.search("Fatih"));

    }
}
