class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sbs=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
            sbs[i]=new StringBuilder();
        char[] arr=s.toCharArray();
        int n=arr.length;
        int ind=0;
        while(ind<n) {
            for(int j=0;j<numRows && ind<n;j++) {
                sbs[j].append(arr[ind++]);
            }
            for(int j=numRows-2;j>0 && ind<n;j--) {
                sbs[j].append(arr[ind++]);
            }
        }
        StringBuilder str=sbs[0];
        for(int i=1;i<numRows;i++) {
            str.append(sbs[i].toString());
        }
        return str.toString();
    } 
}