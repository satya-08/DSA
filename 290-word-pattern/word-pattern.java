class Solution {
    public boolean wordPattern(String pattern, String s) {

        char[] pat=pattern.toCharArray();
        String[] words=s.split(" ");
        int pl=pat.length;
        int wl=words.length;
        if(pl!=wl) return false;

        HashMap<Character,String> hs=new HashMap<>();
        for(int i=0;i<pl;i++){
            char ch=pat[i];
            String wo=words[i];
            if(hs.containsKey(ch)){
            if(!hs.get(ch).equals(wo)) return false;
            }
            else if(hs.containsValue(wo)) return false;
            hs.put(ch,wo);
        }
        return true;
        // int n=pattern.length();
        // String[] words=s.split(" ");
        // if(words.length!=n) return false;
        // HashMap<Character,String> hs1=new HashMap<>();
        // HashMap<String,Character> hs2=new HashMap<>();
        
        // for(int i=0;i<n;i++){
        //     char ch1=pattern.charAt(i);
        //     String ch2=words[i];
        //     if(hs1.containsKey(ch1)){
        //         if(!hs1.get(ch1).equals(ch2)){
        //             return false;
        //         }
        //     }else{
        //         hs1.put(ch1,ch2);
        //     }
        //     if(hs2.containsKey(ch2)){
        //         if(hs2.get(ch2)!=ch1){
        //             return false;
        //         }
        //     }else{
        //         hs2.put(ch2,ch1);
        //     }
        // }
        // return true;
    }
}