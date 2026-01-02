// public class  Myll{

//     public static class Node{
//         int data;
//         Node next ;
//         Node(int data, Node next ){
//             this.data = data;
//             this.next = next ;
//         }

//     }


//     public static class LList{
//         Node head ;
//         LList(){
//             Node head = null;
//         }

//         public void insertionEnd(int key){
//             Node newnode = new Node(key , null);
//             if ( head == null ){
//                 head = newnode ;
//                 head.data= key ;
//             }
//             else{
//                 Node temp = head;
//                 while( temp.next != null){
//                     temp = temp.next;
//                 }

//                 temp.data = key ;
//                 temp.next = newnode;

//             }
//         }

//         public void display(){
//             Node temp = head ;
//             while(temp != null){
//                 System.out.println(temp.data);
//                 temp = temp.next ;
//             }
//         }
//         public void insertionAfter( int after,int  key){
//             Node newnode = new Node(key , null);
//             Node temp = head ;
//             Node tempNext = null;
//             while(temp != null ){
//                 if (temp.data == after){

//                     newnode.data = key ;

//                     tempNext = temp.next;
//                     temp.next = newnode ;
//                     newnode.next = tempNext ;

//                 }
//                 temp = temp.next ;
//             }
//             if ( temp == null ){
//                 System.out.println("element no found .");
//             }
//         }
//     }

//     public static void main(String [] args){
//         LList llist = new LList();
//             llist.insertionEnd(105);
//             llist.insertionEnd(106);
//             llist.insertionEnd(107);
//             llist.insertionEnd(108);
//             llist.insertionEnd(109);
//             llist.insertionEnd(110);

//             System.out.println("befor insertion .");

//             llist.display();

//             llist.insertionAfter(106, 909090);

//             System.out.println("After insertion .");

//             llist.display();

//     }
    
// }