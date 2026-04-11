import java.util.*;

class Solution {
    
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        int size = deq.size();
        ArrayDeque<Integer> temp = new ArrayDeque<>();
        
        for (int i = 0; i < size; i++) {
            int val = deq.poll();
            if (i != X) {
                temp.add(val);
            }
        }
        
        deq.addAll(temp);
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        if (start == end) return;

        int size = deq.size();
        ArrayDeque<Integer> temp = new ArrayDeque<>();

        for (int i = 0; i < size; i++) {
            int val = deq.poll();
            if (i < start || i >= end) {
                temp.add(val);
            }
        }

        deq.addAll(temp);
    }

    public static void eraseAll(ArrayDeque<Integer> deq) {
        deq.clear();
    }
}