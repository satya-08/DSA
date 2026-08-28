class Solution {
    public boolean isPalindrome(String str) {
        // str=str.toLowerCase();
        // str=str.replaceAll("[^A-Za-z0-9]","");
        // int l=0;;
		// int r=str.length()-1;
		// while(l<r) {
		// 	if(str.charAt(l)!=str.charAt(r)) return false;
		// 	l++;
		// 	r--;
		// }
		// return true;

        str=str.toLowerCase();
		int l=0;
		int r=str.length()-1;
		while(l<r) {
			if(!Character.isLetterOrDigit(str.charAt(l))) {
				l++;
				continue;
			}
			if(!Character.isLetterOrDigit(str.charAt(r))) {
				r--;
				continue;
			}
			if(str.charAt(l)!=str.charAt(r)) return false;
			l++;
			r--;
		}
		return true;
    }
}