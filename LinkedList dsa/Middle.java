/**
 * linkedlistpallindrom
 */
import java.util.*;
public class linkedlistpallindrom {
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
    Node first=node;
    Node second=node.next;
    int length=1;
    while(first!=null&&second.next!=null){
          ++length;
          first=first.next;
          second=second.next.next;
    }
    return length;
}
static boolean checkpallindrom(Node node){
  Stack<Integer>S=new Stack<>();
Node temp=node;
  while(node!=null){
      S.add(node.data);
      node=node.next;
  }
  while(temp!=null){
      if(S.peek()!=temp.data){
          return false;
      }
      S.pop();
      temp=temp.next;  }
  
return true;
}


    public static void main(String[] args) {
      if(head==null){
          head=new Node(1);

      }   
   head.next=new Node(2);
   head.next.next=new Node(2);
   head.next.next.next=new Node(1);
   head.next.next.next.next=new Node(4);
   head.next.next.next.next.next=new Node(5);
   System.out.println(checkpallindrom(head));
   System.out.println(middle(head));
    }
}