package DSA_150.ARRAY;

public class A_08 {
    public static void main(){
        int[] arr = {1, 2, 1, 2, 1, 2};
        int size = arr.length;
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }

    }
}
