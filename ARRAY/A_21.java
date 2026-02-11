package DSA_150.ARRAY;

public class A_21 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        int[] temp = new int[n];

        int start = 0;
        int end = n - 1;
        int index = 0;

        while (start <= end) {

                temp[index] = arr[end];// max
                end--;
                index++;

                temp[index] = arr[start]; // min
                start++;
                index++;

        }
        for(int i = 0 ; i < n ; i++){
            System.out.println(temp[i]);
        }

    }
}
