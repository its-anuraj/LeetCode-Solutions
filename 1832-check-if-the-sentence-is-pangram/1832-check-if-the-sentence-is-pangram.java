class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();

        boolean[] arr = new boolean[26];

        for (int i = 0; i < n; i++) {
            char ch = sentence.charAt(i);

            arr[ch - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == false)
                return false;
        }
        return true;

    }
}