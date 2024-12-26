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


        //DELETE METHODU TESTTE İŞE YARAMIYOOO AAAAAA
        public Node delete(Node node, String name){
            if(node==null){
                return null; 
            }
            
            if(name.compareTo(node.name)>0){
                node.right= delete(node.right, name);
                
            }
            else if (name.compareTo(node.name)<0){
                node.left= delete(node.left, name);
            }
            else if (node.left==null && node.right==null){  //childlerın ikiside nullsa
                return null;
            }
            else if (node.left==null){     //birinden biri
                return node.right;
            }
            else if (node.right==null){
                return node.left;
            }
            return node;
        }

        public void inOrder(Node cnode){
            if (cnode!=null){
                inOrder(cnode.left);
                System.out.println(cnode.name + " " + cnode.phone);
                inOrder(cnode.right);
            }

        }

        public void show(Node cnode){
            inOrder(cnode);
        }

        public static void main(String[] args) {
            Tree testTree = new Tree();
            testTree.add("Mahmet", "123");
            testTree.add("Ahmet", "127");
            testTree.add("Zahmet", "124");
            
          
            
            System.out.println(testTree.root.name);
            System.out.println(testTree.root.left.name);
            System.out.println(testTree.root.right.name);
            
            
            System.out.println( testTree.search("Zahmet"));
            System.out.println( testTree.search("Cahmet"));
            
            testTree.add("Kahmet", "321");
            System.out.println(testTree.root.phone);
            
            testTree.show(testTree.root);

            testTree.root = testTree.delete(testTree.root, "Mahmet");

            System.out.println( testTree.search("Mahmet"));

    
           
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
