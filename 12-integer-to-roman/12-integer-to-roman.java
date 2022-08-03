class Solution {
    public String intToRoman(int num) {
        int[] val={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] rom={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder str=new StringBuilder();
        while(num>0) {
            for(int i=12;i>=0;i--) {
                if(num>=val[i]) {
                    num-=val[i];
                    str.append(rom[i]);
                    break;
                }
            }
        }
        return String.valueOf(str);
    }
}