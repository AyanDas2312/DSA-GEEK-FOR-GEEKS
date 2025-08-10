class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if (arr.length < 2) {
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        if (secMax == Integer.MIN_VALUE) {
            return -1;
        }
        return secMax;
    }
}