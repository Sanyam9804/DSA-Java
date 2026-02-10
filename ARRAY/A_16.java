package DSA_150.ARRAY;

public class A_16 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 2, 2, 2,2};
        int size = arr.length;

        for (int i = 0; i < size; i++) {

            int count = 0;

            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > size / 2) {
                System.out.println("Majority Element: " + arr[i]);
                return;
            }
        }

        System.out.println("No Majority Element");
    }
}
