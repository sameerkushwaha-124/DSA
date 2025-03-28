package Tree;

import java.util.*;

public class Node {
    private int data;
    private Node left;
    private Node right;

    Node(int data) {
        this.data = data;
    }
    public static Node buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        System.out.println("Enter data for inserting in left of " + data + ":");
        root.left = buildTree();

        System.out.println("Enter data for inserting in right of " + data + ":");
        root.right = buildTree();

        return root;
    }


    public static void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Pre-order traversal
    public static void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Post-order traversal
    public static void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll(); // Use poll() instead of peek() and remove()

            System.out.print(temp.data + " ");

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    // Search for a node
    public static Node search(Node node, int key) {
        if (node == null || node.data == key) {
            return node;
        }
        if (node.data > key) {
            return search(node.left, key);
        }
        return search(node.right, key);
    }

    // Find the minimum value node
    public static Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private static void Display(Node node){
        if(node==null){
            return;
        }

        String s="";
        s=s+node.data;
        s="<-"+s+"->";

        if(node.left!=null){
            s=node.left.data+s;
        }else{
            s="."+s;
        }
        if(node.right!=null){
            s=s+node.right.data;
        }else{
            s=s+".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);

    }

    public static void main(String args[]) {
        Node root = buildTree();

        // Level order traversal
        System.out.println("\nLevel Order Traversal:");
        Display(root);


        // In-order traversal
        System.out.println("\nIn-Order Traversal:");
        inorderTraversal(root);

        // Pre-order traversal
        System.out.println("Pre-Order:");
        preorderTraversal(root);

        // Post-order traversal
        System.out.println("Post-Order:");
        postorderTraversal(root);

        // Search for a node
        System.out.println("Element found:");
        search(root,5);

        // Find the minimum value node
        System.out.println("MIN:");
        findMin(root);


    }
    public static Node preIn(int pre[],  int in[]){

        Node root = new Node(pre[0]);
        construction(pre,in,0,pre.length,0,pre.length,root);
        
        return root;
    }
    public static Node construction(int pre[], int in[], int is, int ie,int ps,int pe, Node root){
        int ids = search(in,pre[ps]);
        root.left = construction(pre,in,0,pre.length,0,pre.length,root);
        root.right = construction(pre,in,0,pre.length,0,pre.length,root);

        return null;
    }
    public static int search(int in[],int item){
        for(int i =  0; i < in.length; i++){
            if(in[i] == item){
                return i;
            }
        }
        return -1;
    }
}

