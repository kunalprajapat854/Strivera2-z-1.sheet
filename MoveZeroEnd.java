public class MoveZeroEnd {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 0, 0, 12, 4 };
    }

    public void movezerosEnd(int n[]) {
        int i = 0;
        for (int j = 0; j < n.length; j++) {
            if (n[j] != 0) {
                swap(n, i, j);
                i++;
            }
        }
    }

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
