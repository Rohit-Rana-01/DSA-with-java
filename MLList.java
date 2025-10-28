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
             Node head = null ;  }


        // method for insertion at the end .
        public void insertionAtEnd(int key){
            Node newnode = new Node(key , null);

            if( head == null){
                newnode.data = key;
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
        }
        

}
