class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         cyclicSort(arr);
        return searchMissingNumber(arr);
    }

    public void cyclicSort(int[] arr){
         int i=0;
         
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    
    public void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public List<Integer> searchMissingNumber(int[] arr){
        List<Integer> list = new ArrayList<Integer>();
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                list.add(index+1);
            }
        }
        return list;
    }
}
