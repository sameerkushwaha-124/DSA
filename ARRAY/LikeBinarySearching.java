package ARRAY;
// this is not binary search.
public class LikeBinarySearching {
    static void likeBinarySearch(int arr[],int x){
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        if(arr[mid] < x){
            start = mid+1;
            while(start <= end){
                if(arr[start]==x){
                    System.out.println("Index will be:"+start);
                    break;
                }
                start++;
            }
        }
        else{
            end=mid;
            while(start <= end){
                if(arr[start]==x){
                    System.out.println("Index will be:"+start);
                    break;
                }
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        int x=9;
        likeBinarySearch(arr,x);
    }
}
