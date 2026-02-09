package DSA_150.ARRAY;

public class A_11 {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9};
        int sum = 8;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if((arr[i] + arr[j]) == sum){
                    System.out.println("[" + i + ", "+ j + "]");
                }
            }
        }
    }
}
