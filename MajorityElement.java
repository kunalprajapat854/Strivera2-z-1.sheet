import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        // int nums[] = { 1, 2, 2, 1, 2, 2, 1 };
        int nums[] = { 3, 2, 3 };

        System.out.println(Arrays.toString(nums));
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int num[]) {
        // using boyer moore algorithm
        int candidate = num[0];
        int count = 0;

        for (int i : num) {
            if (i == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = i;
                count++;
            }
        }
        return candidate;
    }

}
