class Solution {
public:
    vector<int> greaterElement(vector<int> &arr) {
        vector<int> sorted = arr;
        sort(sorted.begin(), sorted.end());

        vector<int> ans;

        for(int i = 0; i < arr.size(); i++) {
            auto it = upper_bound(sorted.begin(), sorted.end(), arr[i]);

            if(it == sorted.end()) {
                ans.push_back(-10000000);
            }
            else {
                ans.push_back(*it);
            }
        }

        return ans;
    }
};