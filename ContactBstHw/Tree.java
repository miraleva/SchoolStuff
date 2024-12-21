package ContactBstHw;

public class Tree {

    class Node{
        String name;
        String phone;
        Node left;
        Node right;

        Node(String name, String phone){
            this.phone=phone;
            this.name=name;
            this.left=null;
            this.right=null;
        }

    }
}
