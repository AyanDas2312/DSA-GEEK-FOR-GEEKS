class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int k=0;
        if (arr.length == 0) {
            return new ArrayList<>();
        }
        for(int i=1;i<arr.length;i++){
            if(arr[k]!=arr[i]){
                arr[++k]=arr[i];
            }
        }
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            uniqueList.add(arr[i]);
        }

        return uniqueList;
    }
}
