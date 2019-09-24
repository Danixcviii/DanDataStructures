class LinkedList<E>{
  
  Node<E> head;
  
  private Node<E> findNode(E data){
      if(data != null){
      
        Node<E> node = head;
        
        while(node != null){
      
          if(node.data == data) return node;
          
          node = node.next;
          
        }
      
      }
  }
  
  public void addBefore(E newData,E data){
    Node<E> node = findNode(data);
      if(node != null){
      
        
      
      }
  }

}

class Node<E>{
    E data;
    Node<E> next,prev;
}
