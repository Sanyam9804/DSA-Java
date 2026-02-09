package DSA_150.ARRAY;

public class A_14 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] arr1 = {3, 4, 5};

        // print first array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // print only new elements from second array
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr1[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(arr1[i]);
            }
        }
    }
}
