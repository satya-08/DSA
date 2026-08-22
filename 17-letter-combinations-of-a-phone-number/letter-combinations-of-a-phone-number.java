class Solution {
    public List<String> letterCombinations(String digits) {
        String[] letters={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz",""};
        List<String> output=new ArrayList<>();
        if(digits.isEmpty()) return output;
        backtrack("",output,digits,letters);
        return output;
    }
    private static void backtrack(String curres,List<String> output,String digits,String[] letters){
        if(digits.isEmpty()){
            output.add(curres);
            return;
        }
        String letter=letters[digits.charAt(0)-'1'];
        for(char let:letter.toCharArray()){
            backtrack(curres+let,output,digits.substring(1),letters);
        }
    }
}