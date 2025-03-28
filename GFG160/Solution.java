package GFG160;
import java.util.*;

public class Solution {
    //  second largest number.
//    Input: arr[] = [12, 35, 1, 10, 34, 1]
//    Output: 34
    public static void secondLargest(int arr[]){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int val : arr){
            if(val > first){
                second = first;
                first = val;
            }
            else if(val > second && first != val){
                second = val;
            }
        }
        System.out.println(second);
    }
    // pushing zero to end : method 1
//    Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//    Output: [1, 2, 4, 3, 5, 0, 0, 0]
    void pushZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        while (j < arr.length) {
            arr[j++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
    // method 2..
    static void pushZeroToEnd(int arr[]){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // reversing an array iteratively
//    Input: arr = [1, 4, 3, 2, 6, 5]
//    Output: [5, 6, 2, 3, 4, 1]
    public static void reverse(int arr[]){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    // reversing in list
    public void reverseList(){
        List<Integer> number = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        for (int k = 0, j = number.size() - 1; k < j; k++)
        {
            number.add(k, number.remove(j));
        }

        System.out.println(number);
    }
//    Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
//    Output: [[1,1,3],[3,4,5],[7,8,9]]
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int arr[][] = new int[nums.length/3][3];
        int j = 0;
        for(int i = 0; i < nums.length; i = i + 3){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];
            if((c-a) <= k){
                arr[j][0] = a;
                arr[j][1] = b;
                arr[j][2] = c;
                j++;
            }else{
                return new int[0][0];
            }
        }
        return arr;
    }
//    Input: words = ["cool","lock","cook"]
//    Output: ["c","o"]
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : words[0].toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for (char ch : words[i].toCharArray()) {
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }
            for (char key : new HashSet<>(map.keySet())) { // Use a copy to avoid modification issues
                if (temp.containsKey(key)) {
                    map.put(key, Math.min(map.get(key), temp.get(key)));
                } else {
                    map.remove(key);
                }
            }
        }
        List<String> list = new ArrayList<>();
        for(char key : map.keySet()){
            char ch = key;
            for(int i = 0; i <map.get(key); i++){
                list.add(ch+"");
            }

        }
        return list;
    }
//    Input: nums1 = [1,2,3], nums2 = [2,4]
//    Output: 2
    public int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                return nums2[j];
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return -1;

    }
//    Input: nums = [-1,0,1,2,-1,-4]
//    Output: [[-1,-1,2],[-1,0,1]]
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return res;
    }
//    Input: arr = [2, 4, 1, 7, 5, 0]
//    Output: [2, 4, 5, 0, 1, 7]

    void nextPermutation(int[] arr) {
        // bro i am checking dip point..
        int idx = -1;
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }
        // if i did't get dip point that means arr is sorted in
        // decreasing order means you need to reverse only.
        if(idx == -1){
            reverse(arr,0,arr.length-1);
            return;
        }
        // if you got dip points then swap that point
        // with smallest greater than element present at dip point

        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] > arr[idx]){
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                break;
            }
        }

        // at last reverse element after dip points.
        reverse(arr,idx+1,arr.length-1);

    }
    // this is funtion for reversing an array.
    public void reverse(int arr[],int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
//    Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
//    Output: [5, 6]
//    Explanation: 5 and 6 occur more n/3 times.
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int minlen = nums.length/3;
        for(int key : hm.keySet()){
            if(hm.get(key) > minlen){
                list.add(key);
            }
        }
        return list;
    }
//    Input: prices[] = [4, 2, 2, 2, 4]
//    Output: 2
//    Explanation: Buy the stock on day 3 and sell it on day 4 => 4 – 2 = 2.
//    Maximum Profit = 2.
    public int maximumProfit(int prices[]) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // If today's price is higher than yesterday's, add the profit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
//    Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
//    Output: 8
//    Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9.
//    Hence, the profit is 8.
    public int maximumProfit1(int prices[]) {
        int n = prices.length;
        if (n == 0) return 0; // No prices, no profit.

        int minPrice = Integer.MAX_VALUE; // Minimum price seen so far.
        int maxProfit = 0; // Maximum profit.

        for (int price : prices) {
            // Update the minimum price if the current price is lower.
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate the potential profit and update maxProfit if it's higher.
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
//    Given an array arr[] denoting heights of N towers and a positive integer K.
//
//    For each tower, you must perform exactly one of the following operations exactly once.
//
//    Increase the height of the tower by K
//    Decrease the height of the tower by K
//    Find out the minimum possible difference between the height of the shortest and tallest
//    towers after you have modified each tower.
//
//    You can find a slight modification of the problem here.
//    Note: It is compulsory to increase or decrease the height by K for each tower. After the
//    operation, the resultant array should not contain any negative integers.
//    Examples :
//
//    Input: k = 2, arr[] = {1, 5, 8, 10}
//    Output: 5
//    Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.
//    The difference between the largest and the smallest is 8-3 = 5.
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);

        // Step 2: Calculate the initial difference
        int initialDifference = arr[n - 1] - arr[0];
        int minDiff = initialDifference;

        // Step 3: Explore all possible modifications
        for (int i = 0; i < n - 1; i++) {
            // Calculate potential new_min and new_max
            int newMin = Math.min(arr[0] + k, arr[i + 1] - k);
            int newMax = Math.max(arr[n - 1] - k, arr[i] + k);

            // Ignore cases where subtraction makes height negative
            if (arr[i + 1] - k < 0) continue;

            // Update the minimum difference
            minDiff = Math.min(minDiff, newMax - newMin);
        }

        return minDiff;
    }
//    Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
//    Output: 11
//    Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE; // To track the maximum sum found so far
        int currentSum = 0; // To track the current subarray sum

        for (int num : arr) {
            currentSum += num; // Add the current element to the current sum
            maxSoFar = Math.max(maxSoFar, currentSum); // Update max if current sum is greater

            // If the current sum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSoFar;
    }
//    Input: arr[] = [-2, 6, -3, -10, 0, 2]
//    Output: 180
//    Explanation: The subarray with maximum product is {6, -3, -10}
//    with product = 6 * (-3) * (-10) = 180.
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0; // Handle edge case of an empty array

        int maxProduct = arr[0]; // To store the maximum product found so far
        int minProduct = arr[0]; // To store the minimum product (for handling negatives)
        int result = arr[0]; // To store the overall result

        for (int i = 1; i < n; i++) {
            int current = arr[i];

            if (current < 0) {
                // Swap maxProduct and minProduct if the current number is negative
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct
            maxProduct = Math.max(current, maxProduct * current);
            minProduct = Math.min(current, minProduct * current);

            // Update result with the maximum product found so far
            result = Math.max(result, maxProduct);
        }

        return result;
    }
//    Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
//    Output: 22
//    Explanation: Starting from the last element of the array, i.e, 12, and moving in a
//    circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum
//    sum as 22.
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;
        int maxSoFar = Integer.MIN_VALUE; // Tracks the maximum sum found so far
        int currentSum = 0; // Tracks the current subarray sum
        int totalSum = 0; // Tracks the total sum of the array

        // Step 1: Find max subarray sum using Kadane's for non-circular case
        for (int i = 0; i < n; i++) {
            totalSum += arr[i]; // Calculate total array sum
            currentSum += arr[i]; // Add the current element to the current sum
            maxSoFar = Math.max(maxSoFar, currentSum); // Update maxSoFar if currentSum is larger
            if (currentSum < 0) {
                currentSum = 0; // Reset current sum if it goes negative
            }
        }

        // Step 2: Find max circular subarray sum by simulating wrapping
        int minSubarraySum = Integer.MAX_VALUE;
        currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            minSubarraySum = Math.min(minSubarraySum, currentSum); // Track minimum subarray sum
            if (currentSum > 0) {
                currentSum = 0; // Reset current sum if it goes positive
            }
        }

        int maxCircularSum = totalSum - minSubarraySum;

        // Step 3: Handle edge case where all elements are negative
        if (maxCircularSum == 0) {
            return maxSoFar;
        }

        // Step 4: Return the maximum of non-circular and circular sums
        return Math.max(maxSoFar, maxCircularSum);
    }
//    Input: arr[] = [-8, 0, -1, -4, -3]
//    Output: 1
//    Explanation: Smallest positive missing number is 1.
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        HashSet<Integer> hs = new HashSet<>();
        for(int num : arr){
            if(!hs.contains(num) && num > 0){
                hs.add(num);
            }
        }
        for(int i = 1 ; i <= hs.size(); i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return hs.size()+1;
    }
//    Cases for atoi() conversion:

//    Skip any leading whitespaces.
//    Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
//    Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
//    If the integer is greater than 231 – 1, then return 231 – 1 and if the integer is smaller than -231, then return -231.
//    Examples:
    
//    Input: s = "-123"
//    Output: -123
//    Explanation: It is possible to convert -123 into an integer so we returned in the form of an integer
    public int myAtoi(String s) {
        // Your code here
        s = s.trim();
        int i = 0;
        int num = 0;
        int sign;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+'){
            sign = 1;
            i++;
        }else{
            sign = 1;
        }
        while( i < s.length() && s.charAt(i) == '0'){
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            num = num * 10 + (s.charAt(i)-'0');
            if (num > (Integer.MAX_VALUE - (s.charAt(i)-'0')) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;
        }

        return num*sign;
    }
}
