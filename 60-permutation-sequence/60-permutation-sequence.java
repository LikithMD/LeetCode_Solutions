class Solution {
    public String getPermutation(int n, int k) {
        int fac=1;
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<n;i++) {
            fac*=i;
            nums.add(i);
        }
        nums.add(n);
        String ans="";
        k=k-1;
        while(true) {
            ans+=nums.get(k/fac);
            nums.remove(k/fac);
            if(nums.size()==0)
                break;
            k=k%fac;
            fac=fac/nums.size();
        }
        return ans;
    }
}