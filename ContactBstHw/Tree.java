package ContactBstHw;

    public class Tree {
         Node root = null;

        public void add(String name, String phone){
            Node tempNode= new Node(name, phone);
            if( this.root==null){
                this.root= tempNode;

            } else{
                Node cNode= this.root;
                while (cNode != null){
                    if(cNode.name.compareTo(tempNode.name)<0){
                        if(cNode.left==null){
                            cNode.left=tempNode;
                            return;
                        }
                        cNode = cNode.left;
                     
                    } else if(cNode.name.compareTo(tempNode.name)>0){
                        if(cNode.right==null){
                            cNode.right=tempNode;
                            return;
                        }
                        cNode = cNode.right;

                    }else{
                        cNode.phone = tempNode.phone;
                        return;
                    }
                } 
                cNode = tempNode;
            }
        }

        public String search(String name){
            Node cNode= this.root;
                while (cNode != null){
                    if(cNode.name.compareTo(name)<0){

                        cNode = cNode.left;
                     
                    } else if(cNode.name.compareTo(name)>0){
                       
                        cNode = cNode.right;

                    }else{
                        return cNode.phone;
                    }
                } 
            return "Bu isim yok.";

        }

        public void inOrder(Node cnode){
            if (cnode!=null){
                inOrder(cnode.left);
                System.out.println(cnode.name + ": " + cnode.phone);
                inOrder(cnode.right);
            }

        }

        public void show(Node cnode){
            inOrder(cnode);
        }

        public void delete(String name) {

            Node pNode = null; 
                               
            Node cNode = this.root;
            while (cNode != null) {
                if (cNode.name.compareTo(name) < 0) {
    
                    pNode = cNode;
                    cNode = cNode.left;
    
                } else if (cNode.name.compareTo(name) > 0) {
    
                    pNode = cNode;
                    cNode = cNode.right;
    
                } else {
                    break; 
                }
            }
            if (cNode == null) {
                return; 
            }

            if (cNode.left == null && cNode.right == null) {
                if (pNode == null) {
                    this.root = null; 
                } else if (pNode.left == cNode) {
                    pNode.left = null;
                } else {
                    pNode.right = null;
                }
            }
            
            else if (cNode.left == null || cNode.right == null) {
                Node child = (cNode.left != null) ? cNode.left : cNode.right;
                if (pNode == null) {
                    this.root = child; 
                } else if (pNode.left == cNode) {
                    pNode.left = child;
                } else {
                    pNode.right = child;
                }
            } 
            else {
                
                Node successorParent = cNode;
                Node successor = cNode.right;
    
                while (successor.left != null) {
                    successorParent = successor;
                    successor = successor.left;
                }
                
                cNode.name = successor.name;
                
                if (successorParent.left == successor) {
                    successorParent.left = successor.right;
                } else {
                    successorParent.right = successor.right;
                }
    
            }
    
        }

}
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
