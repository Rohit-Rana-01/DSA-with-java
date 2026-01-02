public class Rolist {
    //creating  node ;
    static class node{
        int data ;
        node next ;

        node(int data , node next){
            this.data = data ;
            this.next = next ;
        }
        
    }

    // linked list operations .
    public static class Linkedlist{
        node head = null ;

        // insertion at the end ..
        public void insertionEnd(int key){
            node newnode = new node(key , null);
            if(head == null){
                newnode.data= key ;
                head = newnode ;
            }
            else{
                node temp = head ; 
                while(temp.next != null){
                    temp = temp.next ;
                }
                temp.next= newnode ;
            }
        }
        //insertion at the stating ...
        public void insertionStart(int key){
            node newnode = new node(key , null);
            newnode.next = head ;
            head = newnode ;
        }

        //insetion after the given point ;
        public void insertionAfter(int data,int key){
            node newnode = new node(key , null);
            newnode.data= key ;
            
            node current = head ;
            
            if(head == null ){
                System.out.println("the linked list is empty  ...");

            // }else{
            //     // node slow ;
            //     // while( current != null && current.data != data){
            //     //     slow = current ;
            //     //     current = current.next ;
            //     }
                if(current != null){
                    newnode.next = current.next ;
                    current.next = newnode ;
                }else{
                    System.out.println("element not found ");
                }

            }
        }

        // deletion  of given element 

        public void delete(int key ){

            if ( head == null){
                System.out.println( "the list is empty ..");
                return ;
            }
            if(head.data == key ){
                head = head.next ;
                System.out.println("deletion was successfull ");
            }
            else{
                node curr = head ;
                node slow = null ;
                while(curr != null ){
                      if( curr.data == key){
                        slow.next = curr.next ;
                        System.out.println("deletion was successfull ");
                        break;
                      }
                      slow = curr ;
                      curr = curr.next ;
                }
                if (curr == null ){
                    System.out.println("element was not found ;");
                }
            }
        }
    

        //display ...
        public void display(){
            node temp = head ; 
            while( temp != null ){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        
        // deletion from the end ;


    }


    public static void main(String[] args){
        Linkedlist llist = new Linkedlist();
        llist.insertionEnd(34);
        llist.insertionEnd(35);
        llist.insertionEnd(36);
        llist.insertionEnd(37);
        llist.insertionStart(33);
        llist.insertionAfter(36, 99);
        
        llist.delete(36);
        llist.display();
        llist.delete(34);
        llist.display();
        llist.delete(37);
        llist.display();
        
    }
}
