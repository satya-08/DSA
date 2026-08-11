class Solution {
    public boolean canConstruct(String str1, String str2) {

        int[] arr=new int[26];
        for(char ch:str2.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch:str1.toCharArray()){
            arr[ch-'a']--;
            if(arr[ch-'a']<0) return false;
        }
        return true;
        // HashMap<Character,Integer> hs1=new HashMap<>();
        // HashMap<Character,Integer> hs2=new HashMap<>();
        // for(int i=0;i<str1.length();i++){
        //     char ch=str1.charAt(i);
        //     hs1.put(ch,hs1.getOrDefault(ch,0)+1);
        // }
        //  for(int i=0;i<str2.length();i++){
        //     char ch=str2.charAt(i);
        //     hs2.put(ch,hs2.getOrDefault(ch,0)+1);
        // }
        // List<Map.Entry<Character,Integer>> list1=new Arraylist<>(hs1.entrySet());
        // List<Map.Entry<Character,Integer>> list2=new Arraylist<>(hs2.entrySet());

        // list1.sort((a,b)->a.getValue()-b.getValue());
        // list2.sort((a,b)->a.getValue()-b.getValue());
        // if(list1.size()!=list2.size()) return false;

        // for(int i=0;i<list1.size();i++){
        //     if(list1.get(i).getValue()>list2.get(i).getvalue()){
        //         return false;
        //     }
        // }
        // return true;

    }
}