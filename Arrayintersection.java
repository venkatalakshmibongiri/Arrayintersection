class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    for(int i:nums1)
    {
       set.add(i);
    }
    Set<Integer> intersection = new HashSet<>();    
    for(int j:nums2)
    {
       if(set.contains(j))
       {
           intersection.add(j);
       }
    }  
    int[] arr = new int[intersection.size()];
    int k=0;
    for(Integer i:intersection)
    {
        arr[k++]=i;
    }
    return arr; 
    }
}

Output__________________________________________________
Your input   [1,2,2,1]
             [2,2]
Output       [2]
