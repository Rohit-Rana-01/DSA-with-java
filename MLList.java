public class MLList {
    // creation of Nodes 
     static class Node {
        int data;
        Node next;

        Node(int data, Node next){
            this.data =data;
            this.next = next;
        }
    }

// linked List main block . 
    public static class MyList{

        // initialising the head with the Mylist constroctor .
        Node head ;
        MyList(){
             head = null ;  }


        // method for insertion at the end .
        public void insertionAtEnd(int key){
            Node newnode = new Node(key , null);

            if( head == null){
                head = newnode;
            }else{
                Node temp = head ;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newnode;

            
            }
        }

        // method for displaying the linked list ..
        public void display(){
            Node temp =head ;
            while( temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        
        //  insertion at the  given or  location after an element ...
    
        public void insertionAfter(int element  , int key ){
            if(head == null ){
                System.out.println("The linked list is empty .");
            }
            else{
                Node newnode = new Node(key,null);
                Node temp = head ;
                Node tempNext = null;
                while(temp != null){
                    if( temp.data == element){
                        tempNext= temp.next;
                        temp.next = newnode;
                        newnode.next=tempNext;
                    }
                    temp=temp.next;
                }
               
                if(tempNext == null){
                    System.out.println("the not found . ");
                }
                else{
                    System.out.println("the insertion was successfull.");
                }
            }
        }

        //Deletion of given element ....
        
        public void delete(int key){
            Node current  = head ;
            Node slow = null ;
            Node fast = null ;
            if(head == null ){
                System.out.println("the linked list is empty nothing to delete..");
                return;
            }
            if(head.data == key ){
                head = head.next;
                System.out.println("deletion was successfull ");
            }else{
                while(current != null ){

                    if(current.data == key ){
                        fast = current.next;
                        if(slow != null){
                            slow.next = fast ;
                        } else {
                            head = fast;
                        }
                        System.out.println("deletion was successfull ");
                        break;
                    }
                    slow = current ;
                    current = current.next ;
                }
                if( current == null){
                    System.out.println("element was not found ;");
                }
            }
        }
    }
        public static void main (String [] args){
            MyList LList = new MyList();

            // insertion of an element at the end of the node .

            LList.insertionAtEnd(105);
            LList.insertionAtEnd(106);
            LList.insertionAtEnd(107);
            LList.insertionAtEnd(108);
            LList.insertionAtEnd(109);
            LList.insertionAtEnd(110);

            System.out.println("befor insertion .");

            LList.display();

            LList.insertionAfter(106, 909090);

            System.out.println("After insertion .");

            LList.display();

            LList.delete(10000);

            LList.display();
    }        

}
