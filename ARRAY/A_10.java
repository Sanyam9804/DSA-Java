package DSA_150.ARRAY;

public class A_10 {
    public static void main(String[] args){
        int[] arr  = {1,2,3,4,5};
        int size = arr.length;
        int[] arr1 = new int[size];
        int k = 2;
        int temp = 0;

        for(int i = k ; i < size ; i++){
            arr1[temp++] = arr[i];
        }
        for(int i = 0 ; i < k ; i++){
            arr1[temp++] = arr[i];
        }
        for(int i = 0 ; i < size ; i++){
            System.out.println(arr1[i]);
        }
    }
}
