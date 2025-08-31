class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int l = arr.length;
        if(l%2 != 0){
            l--;
        }
        
        for(int i = 0; i<l; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
