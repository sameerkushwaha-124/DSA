package LinkedList;

import java.util.*;
class Main1 {
    static class Node {
        private Node head;
        private Node tail;
        private Node next;
        int val;

        Node() {
        }

        Node(int val) {
            this.val = val;
            this.next = next;
        }
    }

    public static Node reverseList(Node head) {
        // // base case;

        if (head == null || head.next == null) {
            return head;
        }

        // smaller problem;
        Node x = reverseList(head.next);
        // small calculation;

        Node temp = head.next;
        temp.next = head;
        head.next = null;
        return x;
    }
    public void addFirst(int data){
        Node head = new Node(2);
    }

    //    public static void main (String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int p = sc.nextInt();
//        Node first = new Node(-1);
//        // first = first.next;
//        Node sec = new Node(-1);
//        // sec = sec.next;
//        Node third = new Node(-1);
//        // third = third.next;
//        Node temp = first;
//        for(int i = 0; i < n; i++){
//            temp.next = new Node(sc.nextInt());
//            temp = temp.next;
//        }
//        first = first.next;
//        temp = sec;
//        for(int i = 0; i < m; i++){
//            temp.next = new Node(sc.nextInt());
//            temp = temp.next;
//        }
//        sec = sec.next;
//        temp = third;
//        for(int i = 0; i < p; i++){
//            temp.next = new Node(sc.nextInt());
//            temp = temp.next;
//        }
//        third = third.next;
//        int target = sc.nextInt();
//        for (Node a = first; a != null; a = a.next) {
//            for (Node b = sec; b != null; b = b.next) {
//                for (Node c = third; c != null; c = c.next) {
//                    int  sum = + a.val + b.val + c.val;
//                    if(sum == target){
//                        System.out.print(a.val + " "+ b.val+" "+c.val);
//                        return;
//                    }
//                }
//            }
//        }
//     }
    //  Linked List-K Append.

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node(-1);
        Node temp = head;
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            temp.next = new Node(data);
            temp = temp.next;
        }
        int m = sc.nextInt();
        if (head.next == null || m == 0) {
            head = head.next;
            while (head != null) {
                System.out.println(head.val + " ");
                head = head.next;
            }
            return;
        }
        int pos = n - m;
        temp = head;
        for (int i = 0; i <= pos; i++) {
            temp = temp.next;
        }
        // hear temp is pointing to 8->5->6.
        Node start = temp;
        while (start.next != null) {
            start = start.next;
        }
        int i = 0;
        Node nn = head.next;
        while (nn != null && pos - 1 > i) {
            i++;
            nn = nn.next;
        }
        nn.next = null;
        nn = head.next;
        start.next = nn;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
