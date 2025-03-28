package LinkedList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeSortedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Pair{
        int value;
        ListNode head;
        Pair(int value, ListNode head){
            this.value = value;
            this.head = head;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        // mujhe abb min heap banana hain...
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.value));


        // abb value bhi store ho gyi min heap me...
        for(int i = 0; i < lists.length; i++){
            ListNode head = lists[i];
            if(head != null)
                pq.add(new Pair(head.val,head));
        }

        // abb ans ke liye ek linked list bhi bana lo
        ListNode node = new ListNode(-1);
        ListNode temp = node;


        // abb hamara task ye hian ki min heap se value nikale minimum wali aur user final linked
        // list me add karte jaye..
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            ListNode n = p.head;
            temp.next = n;
            temp = temp.next;

            n = n.next;
            if(n != null)
                pq.add(new Pair(n.val,n));
        }
        // abb linked list ko return kar do
        return node.next;
    }
}
