package Test;
import java.util.*;
public class Test1 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    private TreeNode root;
    public void buildTree(){
        root = bt();
    }
    Scanner sc = new Scanner(System.in);
    private TreeNode bt(){
        System.out.println("Please Enter The Data : ");

        int data = sc.nextInt();
        TreeNode temp_node = new TreeNode();
        temp_node.val = data;

        System.out.println("Enter Boolean Value For Left Node : ");
        boolean bool = sc.nextBoolean();
        if(bool){
            temp_node.left = bt();
        }

        System.out.println("Enter Boolean Value For Right Node : ");
        bool = sc.nextBoolean();
        if(bool){
            temp_node.right = bt();
        }

        return temp_node;
    }

    public void display(){
        System.out.print("PreOrdTrav: ");
        preOrderTraversal(root);

        System.out.println();

        System.out.print("InOrdTrav: ");
        inOrderTraversal(root);

        System.out.println();

        System.out.print("PostOrdTrav: ");
        postOrderTraversal(root);

        System.out.println();

        System.out.print("LevelOrdTrav: ");
        leverOrderTraversal(root);
    }
    private void preOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val +" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    private void inOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    private void postOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }
    private void leverOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp_node = queue.poll();
            System.out.print(temp_node.val+" ");
            if(temp_node.left != null){
                queue.add(temp_node.left);
            }
            if(temp_node.right != null){
                queue.add(temp_node.right);
            }
        }
    }

    public void findData(int target){
        System.out.println();
        System.out.println("Surety of find target is : "+ findData(root,target));
    }
    private boolean findData(TreeNode root, int target){
        if(root == null){
            return false;
        }
        if(root.val == target){
            return true;
        }

        boolean left_call = findData(root.left,target);
        boolean right_call = findData(root.right,target);

        return left_call || right_call;
    }



    public void maxValue()  {

//        maxValue(root);
//        System.out.println(max);

        System.out.println(maxValue(root));
    }

//    int max = Integer.MIN_VALUE;
//    private void maxValue(TreeNode root){
//        if(root == null){
//            return ;
//        }
//        if(root.val > max){
//            max = root.val;
//        }
//
//        maxValue(root.left);
//        maxValue(root.right);
//
//    }
    private int maxValue(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int leftmax = maxValue(root.left);
        int rightmax = maxValue(root.right);

        return Math.max(root.val,Math.max(leftmax,rightmax));
    }


    public void heightOfTree(){
        System.out.println("Max Height: ");
        System.out.println(maxHeightOfTree(root));

        System.out.println();

        System.out.println("Min Height : ");
        System.out.println(minHeihtOfTree(root));
    }
    private int maxHeightOfTree(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftcall = 1+ maxHeightOfTree(root.left);
        int rightcall =1+ maxHeightOfTree(root.right);

        return Math.max(leftcall,rightcall);
    }

    private int minHeihtOfTree(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftcall = 1 + minHeihtOfTree(root.left);
        int rightcall = 1 + minHeihtOfTree(root.right);

        return Math.min(leftcall,rightcall);

    }





    public static void main(String[] args){
        Test1 obj = new Test1();
        obj.buildTree();
        obj.display();

        obj.findData(7);

        obj.maxValue();
        obj.heightOfTree();
    }
}

// input : 1 true 2 true 3 false false true 4 false false true 5 true 6 false false true 7 false false