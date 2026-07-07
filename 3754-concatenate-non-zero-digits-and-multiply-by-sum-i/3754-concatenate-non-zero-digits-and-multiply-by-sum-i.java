class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        int sum=0;
        String x="";
        for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='0')
                    continue;
                else
                {
                    x+=ch;
                    sum+=(int)(ch-'0');
                }
            }
        if(x=="")
            return 0;
        return (Long.parseLong(x)*sum);
    }
}