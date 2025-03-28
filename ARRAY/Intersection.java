public class Intersection {
    static void intersection(int[] arr1, int[] arr2){
        Intersection obj = new Intersection();
        obj.remDubEle(arr1,arr2);
    }
    void remDubEle(int[] arr1, int[] arr2) {
        int count1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    arr1[i] = -1;
                    count1++;
                }
            }
        }
        int count2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j]) {
                    arr2[i] = -1;
                    count2++;
                }
            }
        }
        int arr3[] = new int[arr1.length - count1];
        int arr4[] = new int[arr2.length - count2];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                arr3[j] = arr1[i];
                j++;
            }
        }
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != -1) {
                arr4[k] = arr2[i];
                k++;
            }
        }
        System.out.println("first Array:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        System.out.println("Second Array:");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();
        System.out.println("Intersection of these two Array is: ");
        if (arr3.length >=arr4.length) {
            for (int i = 0; i < arr4.length; i++) {
                for (int m = 0; m < arr3.length; m++) {
                    if (arr4[i] == arr3[m]) {
                        System.out.print(arr4[i] + " ");
                    }
                }

            }
        }
        else {
            for (int i = 0; i < arr3.length; i++) {
                for (int m = 0; m < arr4.length; m++) {
                    if (arr3[i] == arr4[m]) {
                        System.out.print(arr3[i] + " ");
                    }
                }

            }
        }
    }
    public static void main(String args[]){
        intersection(new int[]{1,2,2,2,4,4,3,2},new int[]{3,3,6,1});

    }
}

