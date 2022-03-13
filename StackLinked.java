public class StackLinked {
    
    Node top;
    public void StackPush(int data){
        
        Node node = new Node();
        node.data = data;        
        node.next = top;
        top = node;   
        System.out.println("Data inserted in node : " + node.data);
    }
    public void StackPop(){
        
        Node node = new Node();        
        node.next = null;
        if(top == null){            
            System.out.println("Stack Underflow");
        }
        else{
            
            Node temp = top;                        
            top = temp.next;            
            System.out.println("Popped out data : " + temp.data);
        }
    }
    public void stackshow(){
        
        if(top == null){            
            System.out.println("Stack Underflow");
        }
        else{
            Node node = top;
            while(node.next!=null){
                System.out.print(node.data + " --> ");
                node = node.next;
            }
            System.out.print(node.data + "\n");
        }
    }
}
