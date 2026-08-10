class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        for(String str:words){
            if(check(str,pattern)) ans.add(str);
        }
        return ans;
        // List<String> ans=new ArrayList<>();
        // int n=words.length;
        // int j=0;
        // char[] p=pattern.toCharArray();
        // while(j<n){
        //     char[] s1=words[j++].toCharArray();
        //     int pl=p.length;
        //     int sl=s1.length;
        //     if(pl!=sl) break;
        //     boolean found=true;
        //     HashMap<Character,Character> hs=new HashMap<>();
        //     for(int i=0;i<pl;i++){
        //         char v1=p[i];
        //         char v2=s1[i];
        //         if(hs.containsKey(v1)){
        //             if((hs.get(v1)!=v2)){
        //                 found=false;
        //                 break;
        //             }
        //             }else{
        //                  if(hs.containsValue(v2)){
        //                 found=false;
        //                 break;
        //             }
        //             hs.put(v1,v2);
        //         }
        //     }
        //     if(found){
        //         ans.add(new String(s1));
        //     }

        // }
        // return ans;
    }
    private static boolean check(String str,String pattern){
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.indexOf(str.charAt(i))!=pattern.indexOf(pattern.charAt(i))) return false;
        }
        return true;
    }
}