public class rostack {

    public static class Stack {
        
        public static class Node {
            int data;
            Node next;
    
            public Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }
        Node top = null;
        
        public void push(int key) {
            Node newnode = new Node(key, null);
            newnode.next = top;
            top = newnode;
        }

        public void pop() {
            if (top == null) {
                System.out.println("Stack Underflow - nothing to pop");
                return;
            }
            System.out.println("Popped: " + top.data);
            top = top.next;
        }

        public void peek() {
            if (top == null) {
                System.out.println("Stack is empty - no top element");
                return;
            }
            System.out.println("Top element: " + top.data);
        }

        public void display() {
            Node temp = top; 
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(7);
        stack.push(75);
        stack.push(745);
        stack.push(743);
        stack.push(37);

        System.out.println("Stack contents:");
        stack.display();

        stack.peek();  

        stack.pop();

        System.out.println("\nAfter pop:");
        stack.display();

        stack.peek();  // check after pop
    }
}
