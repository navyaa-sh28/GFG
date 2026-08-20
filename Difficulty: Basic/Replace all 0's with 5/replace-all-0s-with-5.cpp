class Solution {
  public:
    int convertFive(int n) {
        // code here
        string num=to_string(n);
        for(int i=0;i<num.size();i++){
            if(num[i]=='0'){
                num[i]='5';
            }
        }
        int result=stoi(num);
        return result;
    }
};