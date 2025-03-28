package ARRAY;

public class Frequency {
    public static void main(String args[]){
        int given_array[] = {1,1,1,2,2,2,3};
  //    int given_array[] = new int[]{1,1,1,2,2,2,3};
        int frequency_array[] = new int [given_array.length];
        int dublicacy_removed_array[] = new int [given_array.length];
        for(int i=0;i< given_array.length;i++){
            int count=0;
            for(int j=1;j<given_array.length;j++){
                if(given_array[i]==given_array[j]){
                    count++;
                }
            }
            System.out.println(given_array[i]+":"+count);
        }


    }
}
