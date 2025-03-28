package Stack;

public class StacK {
    int arr[];
    int size;
    StacK(int size){
        this.size = size;
        arr = new int[size];
    }
    int idx = -1;
    private int peek(){
        return arr[idx];
    }
    private int pop() throws Exception{
        if(idx == -1){
            throw new Exception("Stack is empty");
        }
        int x = arr[idx];
        idx--;
        return x;
    }
    private void push(int element){
        try{
            idx++;
            arr[idx] = element;
        }catch(Exception e){
            System.out.println("Stack Overflow");
        }
    }
    private boolean isempty(){
        if(idx == -1){
            return true;
        }
        return false;
    }
    private int size(){
        return idx+1;
    }
    private void print(){
        if(idx == size){
            return;
        }
        System.out.print("[");
        for(int i = 0; i <= idx; i++){
            if(i != idx)
            System.out.print(arr[i] + ", ");
            else{
                System.out.print( arr[i] );
            }
        }
        System.out.print("]");
        System.out.println();
    }
    private void atLast(int data){
        int size = size();
        arr[size] = data;
    }


    public static void main(String[] args) throws Exception {
        StacK obj = new StacK(0);
//        obj.pop();
        obj.push(1);
//        obj.push(10);
//        obj.push(3);
//        obj.push(5);
//        obj.push(90);
//        obj.print();
//        obj.push(3);
//        obj.print();
//        System.out.println(obj.pop());
//        obj.push(8);
//        obj.atLast(100);
//        obj.pop();
//        System.out.println(obj.peek());
//        obj.print();
//        System.out.println(obj.isempty());
//        System.out.println(obj.size());

    }
}
