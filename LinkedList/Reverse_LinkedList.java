package LinkedList;
import java.util.*;
public class Reverse_LinkedList {
    static class ListNode{
        ListNode next;
        int val;
        ListNode(){
            this.next = null;
        }
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
       ListNode head = new ListNode();
       ListNode temp = head;
       temp.next = new ListNode(1);
       temp = temp.next;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(5);


        head  = reverse(head.next);
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
    // using looping..
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode later = curr.next;
            curr.next = prev;
            prev = curr;
            curr = later;
        }
        return prev;
    }
    // using recurr..

    public static ListNode recurr(ListNode head){
        if(head==null || head.next == null){
            return head;
        }
        ListNode x  = recurr(head.next);
        ListNode temp = null;

        head.next.next = head;
        head.next = null;
        return x;
    }

}
