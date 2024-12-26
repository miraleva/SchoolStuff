package ContactBstHw;

//Tree.java ya package eklediğimde 7. satırın kırmızı çizgisi gitti fakaat aynı hata var

public class Main {
    public static void main(String[] args) {
        Tree testTree = new Tree();
        testTree.add("Mahmet", "123");
        testTree.add("Ahmet", "127");
        testTree.add("Zahmet", "124");
        testTree.add("Yahmet", "334");
        testTree.add("Kahmet", "128");
      
        
        System.out.println(testTree.root.name);
        System.out.println(testTree.root.left.name);
        System.out.println(testTree.root.right.name);
        
        
        System.out.println( testTree.search("Zahmet"));
        System.out.println( testTree.search("Cahmet"));
        
        testTree.add("Mahmet", "321");
        System.out.println(testTree.root.phone);


        testTree.show(testTree.root);
    }

    
}
