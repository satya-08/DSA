class Solution {
    public boolean isAnagram(String str1, String str2) {
        int n=str1.length();
		int m=str2.length();
		if(m!=n) return false;
		int freq[]=new int[26];
		for(int i=0;i<n;i++) {
			freq[str1.charAt(i)-'a']++;
			freq[str2.charAt(i)-'a']--;
		}
		for(int i=0;i<26;i++) {
			if(freq[i]!=0) return false;
		}
		return true;
    }
}