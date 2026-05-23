class Solution {

    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for(int i = 0; i < s.length(); i++) {

            String temp = "";

            for(int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if(temp.indexOf(ch) != -1) {
                    break;
                }

                temp += ch;

                maxLength = Math.max(maxLength, temp.length());
            }
        }

        return maxLength;
    }
}