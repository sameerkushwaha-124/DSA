package Stack;
import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        int arr[] = {5,30,40,38,35};

        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = i + 1;
            }else{
                ans[i] = Math.abs(st.peek() - i);
            }
            st.push(i);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println("END");

    }
}
