class Solution {
    public String addStrings(String num1, String num2) {
        int carry=0;
        int n=num1.length()-1;
        int m=num2.length()-1;
        String res="";
        while(n>=0 || m>=0||carry!=0){
            int sum=0;
            if(n>=0){
                sum+=(num1.charAt(n--)-'0');
            }
            if(m>=0) sum+=(num2.charAt(m--)-'0');
            sum+=carry;
            carry=sum/10;
            res+=(sum%10);
            sum%=10;
        }
        StringBuilder sb=new StringBuilder(res);
        sb=sb.reverse();
        return sb.toString();
    }
}