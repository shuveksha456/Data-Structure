public class RecursionMergeSort {
    static void sort(int[] a, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int[] temp = new int[end - start];
        int k = 0;
        while (i < mid && j < end) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i < mid) {
            temp[k++] = a[i++];
        }
        while (j < end) {
            temp[k++] = a[j++];
        }
        k = 0;
        for (i = start; i < end;) {
            a[i++] = temp[k++];
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 6, 1, 3, 4, 10, 20, 5, 6 };
        int size = a.length;
        System.out.println(" Array Before sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        // euta portion lai sort garxa line 35 36 21-23
        sort(a, 0, 2, 4);
        System.out.println();

        System.out.println(" Array  After sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
