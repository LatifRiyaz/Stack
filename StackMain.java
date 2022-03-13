import java.util.*;

public class StackMain {    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        StackLinked sn = new StackLinked();
        int choice,c;
        do{
            System.out.print("1. Insert an element in stack\n2. Delete an element from stack\n3. Display Stack Elements\n4. Exit\nEnter your choice : ");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the integer data to be inserted : ");
                    int s1 = in.nextInt();
                    sn.StackPush(s1);
                    break;
                    
                case 2:                    
                    sn.StackPop();
                    break;
                
                case 3:
                    System.out.print("Data in Stack : ");
                    sn.stackshow();
                    break;
                    
                case 4:
                    System.out.println("GoodBye!!!");
                    System.exit(0);
                 
                default:
                    System.out.println("Invalid Choice");                    
            }
            System.out.print("Enter integer 1(one) to continue : ");
            c = in.nextInt();                   
        }while(c == 1);
    }
}
