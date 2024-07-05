package Stack;
// 0 1 0   >>> every one knows celebrity but not he!
// 0 0 0
// 0 1 0
public class CelebrityProblem {
    public static void main(String args[]){
        int arr[][] = {
                {0,1,0},
                {0,1,0},
                {0,0,0}
        };
        // checking row.
        for(int i = 0; i < arr.length; i++){

            boolean bool = true;
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 1){
                    bool = false;
                    break;
                }
            }
            if(bool == true){
                if(celebrityFinder(i, arr)){
                    System.out.println("celebrity Founded");
                    return;
                }
            }
        }
            System.out.println("No Celebrity Exist in the party");
    }
    public static boolean celebrityFinder(int row,int arr[][]){
        boolean bool = true;
        for(int i = 0; i < arr.length; i++){
            if(i != row && arr[i][row] != 1){
                bool  = false;
            }
        }
        return bool;
    }

}
