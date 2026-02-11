package DSA_150.ARRAY;

import java.util.HashSet;

public class A_24 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2};
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            boolean flag = false;
            for (int j = 1; j < size; j++) {
                if (i != j && arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("FIRST NON  REPEATING ELEMENT IS : "+arr[i]);
                break;
            }
        }

    }
}
