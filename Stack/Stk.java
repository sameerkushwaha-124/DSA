package Stack;
// Implimentation of Stack using LinkedList.
class Node {
    int val ;
    Node next;
    Node(int x) {
        val = x;
        next = null;
    }
}
public class Stk {
    Node top;
    public Node peek(){
        if(top != null){
            return top;
        }
        return null;
    }
    public Node pop(){
        if(top == null){
            return null;
        }else{
            Node temp =new Node(top.val) ;
            top = top.next;
            return temp;
        }
    }
    public void push(Node n){
        if(n != null){
            n.next = top;
            top = n;
        }
    }
}
