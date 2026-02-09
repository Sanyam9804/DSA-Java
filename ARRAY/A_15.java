package DSA_150.ARRAY;

public class A_15 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] arr1 = {3, 4, 5};
        boolean printed = false;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr1.length ; j++){
                if(arr[i] == arr1[j] && !printed){
                    System.out.println(arr[i]);
                    printed = true;
                }
            }
        }
    }
}
