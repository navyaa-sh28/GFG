class Solution {
  public:
    bool checkPangram(string& s) {
        vector<int> alpha(26, 0);

        for(int i = 0; i < s.size(); i++) {
            char ch = tolower(s[i]);
            alpha[ch - 'a'] = 1;
        }

        for(int i = 0; i < 26; i++) {
            if(alpha[i] == 0) {
                return 0;
            }
        }

        return 1;
    }
};