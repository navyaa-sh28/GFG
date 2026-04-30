class Solution {
  public:
    int findElementAtIndex(int i, vector<int> &arr) {
        if (i < 0 || i >= arr.size()) return -1; // invalid index
        return arr[i];
    }
};
