class Solution {
    public int[] maxlength(int [] nums,int k){
        int [] st=new int[k];
        int remove=nums.length-k;
        int top=-1;
        for(int n:nums){
            while(top>=0 && st[top]<n && remove>0){
                top--;
                remove--;
            }
            if(top<k-1){
                st[++top]=n;
            }else{
                remove--;
            }
        }
        return st;
    }
    public int[] merge(int[] a,int [] b){
        int ans[]=new int[a.length+b.length];
        int i=0;
        int j=0;
        int r=0;
        while(i<a.length || j<b.length){
            if(greater(a,i,b,j)){
                ans[r++]=a[i++];
            }else{
                ans[r++]=b[j++];
            }
        }
        return ans;
    }
    public boolean greater(int [] a,int i,int [] b,int j){
        while(i<a.length && j<b.length && a[i]==b[j]){
            i++;
            j++;
        }
        if(j==b.length){
            return true;
        }
        if(i==a.length){
            return false;
        }
        return a[i]>b[j];
    }
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m=nums1.length;
        int n=nums2.length;
        int start=Math.max(0,k-n);
        int end=Math.min(k,m);
        int ans[]=new int[k];
        for(int i=start;i<=end;i++){

            int a[]=maxlength(nums1,i);
            int b[]=maxlength(nums2,k-i);
            int combine[]=merge(a,b);
            if(greater(combine,0,ans,0)){
                ans=combine;
            }
        }
        return ans;
    }
}