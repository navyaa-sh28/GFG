class Solution {
  public:
    vector<int> matrixSum(int n, int m, vector<vector<int>> mat, int q,
                         vector<int> queries[]) {
        
        vector<int> ans;
        
        for(int k = 0; k < q; k++) {
            int type = queries[k][0];
            int i = queries[k][1];
            int j = queries[k][2];
            
            int sum = 0;
            
            for(int dx = -type; dx <= type; dx++) {
                for(int dy = -type; dy <= type; dy++) {
                    
                    // skip center
                    if(dx == 0 && dy == 0) continue;
                    
                    // pick only exact hop distance
                    if(max(abs(dx), abs(dy)) == type) {
                        int ni = i + dx;
                        int nj = j + dy;
                        
                        if(ni >= 0 && ni < n && nj >= 0 && nj < m) {
                            sum += mat[ni][nj];
                        }
                    }
                }
            }
            
            ans.push_back(sum);
        }
        
        return ans;
    }
};