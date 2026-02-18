import java.util.Arrays;

class Solution {
    public static char extraChar(String s1, String s2) {

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return arr2[i];
            }
        }

        // If all previous matched,
        // extra character is last one
        return arr2[arr2.length - 1];
    }
}
