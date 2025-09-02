import java.util.HashMap;

public class DuplicateArray2 {

    public static void main(String[] args) {
        int nums[] = { 1, 0, 1, 1 };
        int k = 2;
        System.out.println(is_duplicate(nums, k));
    }

    public static boolean is_duplicate(int n[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            if (map.containsKey(n[i])) {
                int index = map.get(n[i]);
                if ((i - index) <= target)
                    return true;

                else
                    map.put(n[i], i);
            } else
                map.put(n[i], i);

        }
        return false;
    }

}
