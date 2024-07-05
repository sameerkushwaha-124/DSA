package Stack;
import java.util.Stack;

public class RedundantBrackets {
    public static boolean redundantBrackets(String str){
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '(' || ch =='+' || ch == '*' || ch == '/' || ch == '-'){
                st.push(ch);
            }
            else{
                if(ch == ')'){
                    boolean isRed = true;
                    while(st.peek() != '(') {
                        char c = st.peek();
                        if(isOperator(c)){
                            isRed = false;
                        }
                        st.pop();
                    }
                    if(isRed == true){
                        return true;
                    }
                    st.pop();
                }
            }
        }
        return false;
    }
    public static boolean isOperator(char ch){
        if(ch == '+' || ch == '*' || ch == '/' || ch == '-') return true;
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b)+a)";
        System.out.println(redundantBrackets(str));
    }
}
