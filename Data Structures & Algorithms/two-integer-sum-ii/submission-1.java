class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int[] arr = new int[2]; 
        while(start < numbers.length){
            int compare = numbers[start+1];
            for(start = 0; start < numbers.length; start++){
                for(int i = start+1; i < numbers.length; i++){
                    compare = numbers[i];
                    if( numbers[start] != compare && compare + numbers[start] == target){
                        arr[0] = start+1;
                        arr[1] = i+1;
                        return arr;
                    }
                }
                
            }
        }
        return null;
        
        
    }
}
