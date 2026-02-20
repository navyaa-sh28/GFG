// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String s=S1+S2;
        String sr="";
        for(int i=s.length()-1;i>=0;i--){
            sr=sr+s.charAt(i);
        }
        return sr;
}
}