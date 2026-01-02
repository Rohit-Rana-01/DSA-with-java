public class Rotree {
    
    public static class tree{

        //node creation for stack 
        public static class Node{
            int data ;
            Node left , right;

            Node(int data ){
                this.data = data ;
                 left = right = null ;
            }
        }

        // insertion function . 
        public void insertion(int key){
            root =  insertdata(root ,key);
        }
        public Node insertdata(Node root , int key ){
            if(root == null) root = new Node(key);
            if(key < root.data) root.left = insertdata(root.left , key );
            if(key > root.data) root.right = insertdata(root.right , key );


            return root ;
        }
        
        // display function of tree 
        public void inorder(Node root){
            if ( root  == null ) return;
            inorder(root.left);
            System.out.print(root.data + "  ");
            inorder(root.right);
           
            
        }
    
        Node root = null ;

    }
    
    // Main function 
    public static void main (String[] args){
        tree t = new tree();
        
        
        // t.root = new tree.Node(50);
        // t.root.left = new tree.Node(30);
        // t.root.right = new tree.Node(70);
        // t.root.left.left = new tree.Node(20);
        // t.root.right.left = new tree.Node(60);
        // t.root.right.right = new tree.Node(80);
        // t.root.left.right= new tree.Node(40);

        t.insertion(50);
        t.insertion(30);
        t.insertion(70);
        t.insertion(20);
        t.insertion(60);
        t.insertion(80);
        t.insertion(40);

        t.inorder(t.root);
        
    }
}
