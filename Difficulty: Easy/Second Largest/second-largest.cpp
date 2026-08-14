class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        sort(arr.begin(), arr.end());

        int i = arr.size() - 2;

        while(i >= 0 && arr[i] == arr[arr.size() - 1]) {
            i--;
        }

        if(i >= 0)
            return arr[i];
        else
            return -1;
    }
};