
import java.util.*;
public class  Reverse {
static Node head;
static class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
   next=null;
    }
}
static void print(Node node){
    while(node!=null){
        System.out.println(node.data);
        node=node.next;
    }
}
static int middle(Node node){
     
    Node fast = head, slow = head;
    while(fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
      
    }
System.out.println(slow.data);
return 0;
}
static Node reverse(Node head) 
    { 
        if (head == null || head.next == null) 
            return head; 
 
        Node rest = reverse(head.next); 
        head.next.next = head; 
 
       
        head.next = null; 
          print(rest);
        return rest; 
    } 
    public static void main(String[] args) {
      if(head==null){
          head=new Node(1);

      }   
   head.next=new Node(2);
   head.next.next=new Node(3);
   head.next.next.next=new Node(4);
 
head=reverse(head);

  


    }
}
