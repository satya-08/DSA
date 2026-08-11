class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int n=num1.length();
        int m=num2.length();
        if(num1.equals("0")||num2.equals("0")) return "0";
        int[] res=new int[n+m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int a=num1.charAt(i)-'0';
                int b=num2.charAt(j)-'0';
                int pro=a*b;
                int pos=i+j+1;
                int sum=pro+res[pos];
                res[pos]=sum%10;
                res[pos-1]+=sum/10;

            }
            }
            for(int num:res){
                if(sb.length()==0&&num==0){
                    continue;
                }
                sb.append(num);
            }
            return sb.toString();
        }
    
}