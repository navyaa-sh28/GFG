import java.util.*;

class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        
        int diagonalSum = 0;
        
        // Step 1: Left diagonal sum
        for(int i = 0; i < n; i++) {
            diagonalSum += a[i][i];
        }
        
        // Step 2: Find max in b[]
        int max = b[0];
        for(int i = 1; i < n; i++) {
            if(b[i] > max) {
                max = b[i];
            }
        }
        
        // Step 3: Store result
        ArrayList<Integer> result = new ArrayList<>();
        result.add(diagonalSum);
        result.add(max);
        
        return result;
    }
}