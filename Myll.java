public class Myll{

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data ;
        }
        Node(int data ,Node next ){
            this.data = data ;
            this.next = next;
        }
    }


    
    public static void main (String[] args){
        Node head = null ;

        Node node = new Node(90);
        System.out.println(node.data+"  " +node.next);
        }
    }
