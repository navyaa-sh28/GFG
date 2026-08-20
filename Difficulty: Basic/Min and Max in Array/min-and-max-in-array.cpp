class Solution {
  public:
    vector<int> getMinMax(vector<int> &arr) {
        // code here
        int small=INT_MAX;
        int large=INT_MIN;
        for(int i=0;i<arr.size();i++){
            if(arr[i]>large){
                large=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }
       vector<int>ans;
       ans.push_back(small);
       ans.push_back(large);
       return ans;
    }
};