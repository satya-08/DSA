class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n) return false;
        HashMap<Character,Character> hs1=new HashMap<>();
        HashMap<Character,Character> hs2=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(hs1.containsKey(ch1)){
                if(hs1.get(ch1)!=ch2){
                    return false;
                }
            }else{
                hs1.put(ch1,ch2);
            }
            if(hs2.containsKey(ch2)){
                if(hs2.get(ch2)!=ch1){
                    return false;
                }
            }else{
                hs2.put(ch2,ch1);
            }
            // hs1.put(ch1,hs1.getOrDefault(ch1,0)+1);
            // hs2.put(ch2,hs2.getOrDefault(ch2,0)+1);
        }
        // List<Map.Entry<Character,Integer>> list1=new ArrayList<>(hs1.entrySet());
        // List<Map.Entry<Character,Integer>> list2=new ArrayList<>(hs2.entrySet());

        // list1.sort((a,b)->Integer.compare(a.getValue(),b.getValue()));
        // list2.sort((a,b)->Integer.compare(a.getValue(),b.getValue()));
        // for(int i=0;i<list1.size();i++){
        //     if(!list1.get(i).getValue().equals(list2.get(i).getValue())){
        //         return false;
        //     }
        // }
        return true;
    }
}