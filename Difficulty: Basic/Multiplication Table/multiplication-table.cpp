// User function Template for C++
class Solution {
  public:
    vector<int> getTable(int n) {
        //  Code here
        vector<int> Table(10);
        for(int i=1;i<=10;i++){
            Table[i-1]=i*n;
        }
        return Table;
    }
};