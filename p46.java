public class p46 {
    public List<List<Integer>> permute(int[] nums) {
        int n= nums.length;
    
        ArrayList<List<Integer>> list = new ArrayList<>();
        boolean used [] = new boolean[n];
     List<Integer> curr = new ArrayList<>();
            backtrack(nums, list ,used , curr);
            return list;
        }
    private  void backtrack(int [] arr , List<List<Integer>> list ,
    boolean []used,List<Integer> curr){
        if(curr.size() == arr.length)
        list.add(new ArrayList<>(curr));
        for(int i=0;i<arr.length;i++){
            if(!used[i]){
                used[i] = true;
                curr.add(arr[i]); // now this element added 
                //now add above element to nested list 
                backtrack( arr , list ,used,curr);
               curr.remove(curr.size()-1);
               used[i] = false;//now use that element for other permuatation
        }
    }
}
}
