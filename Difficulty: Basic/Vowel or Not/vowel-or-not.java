// User function Template for Java
class Solution {
    String isVowel(char c) {
        char ch = Character.toLowerCase(c);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "YES";
        } else {
            return "NO";
        }
    }
}
