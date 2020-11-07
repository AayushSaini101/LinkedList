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
