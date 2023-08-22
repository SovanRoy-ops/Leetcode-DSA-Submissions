class Solution {
    public List<Integer> findDuplicates(int[] arr) {
     int i=0;
      List<Integer> list=new ArrayList<Integer>();   
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                list.add(arr[index]);
            }
        }
        return list;
    }

    public void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
