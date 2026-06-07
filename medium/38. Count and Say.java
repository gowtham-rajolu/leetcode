class Solution {
    public String countAndSay(int n) {
        if(n<=0)return "";
        if(n==1)return "1";
        String s="1";
        for(int k=1;k<n;k++)
        {
            int i=0,j=0;
            String temp="";
            while(j<s.length())
            {
                while(j<s.length()&&s.charAt(i)==s.charAt(j))j++;
                temp+=Integer.toString(j-i)+s.charAt(i);
                i=j;
            }
            s=temp;
        }
        return s;
    }
}