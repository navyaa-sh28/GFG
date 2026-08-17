string sliceString(string &s) {
    // code here
    string s2="";
    for(int i=0;i<s.size();i++){
        if(i!=0&&i!=s.size()-1){
            s2+=s[i];
        }
    }
    return s2;
}