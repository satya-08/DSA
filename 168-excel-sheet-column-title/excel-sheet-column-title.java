class Solution {
    public String convertToTitle(int num) {
        StringBuilder sb=new StringBuilder();

        while(num>0){
            num--;
            sb.append((char)(num%26+'A'));
            num/=26;
        }
        return sb.reverse().toString();

    }
}