class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }

        StringBuilder result = new StringBuilder(word.substring(0, index + 1));
        result.reverse();
        result.append(word.substring(index + 1));

        return result.toString();
    }
}