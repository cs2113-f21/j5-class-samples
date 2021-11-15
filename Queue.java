public class Queue {
    private volatile Node head = null, tail = null;

    public synchronized void enqueue(String s) {
      if( head == null ) {
        head = tail = new Node(s, null);
      } else {
        tail.next = new Node(s, null);
        tail = tail.next;
      }
    }
  
    public String dequeue() {
      Node t = head;
  
      head = head.next;
  
      if( head == null ) {
        tail = null;
      }
      return t.data;
    }
  
    public boolean empty() {
      return head == null;
    }
  
    private class Node {
      public String data;
      public Node next;
      public Node(String d, Node n) {
        data = d;
        next = n;
      }
    }
    
  }
  