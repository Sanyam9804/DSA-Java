package DSA_150.ARRAY;

public class A_06 {
    public static void main(String args[]) {
        int[] arr = {1, 0, 1, 0, 1, 0};
        int size = arr.length;
        int start = 0;
        int end = size - 1;
        while (start < end) {
            if (arr[start] == 1) {
                start++;
            }
            else if (arr[end] == 0) {
                end--;
            }
            else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    /* second approach
    int countZero = 0;

for (int i = 0; i < size; i++) {
    if (arr[i] == 0) countZero++;
}

for (int i = 0; i < size; i++) {
    if (i < countZero)
        arr[i] = 1;
    else
        arr[i] = 0;
}

    */
}
