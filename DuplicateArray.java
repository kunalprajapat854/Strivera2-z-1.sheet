import java.util.HashSet;

public class DuplicateArray {
    public static void main(String[] args) {
        // int nums[] = { 1, 2, 2, 3 };
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(duplicate(nums));
    }

    public static boolean duplicate(int n[]) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : n) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }

}

// time complexity of o(n) length of the array n
// leetcode problem 217
