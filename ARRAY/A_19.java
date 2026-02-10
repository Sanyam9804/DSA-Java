package DSA_150.ARRAY;

public class A_19 {
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        int size = arr.length;

        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i = 0 ; i < size ; i++){
            currSum = Math.max(arr[i] , currSum+arr[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println("MAX SUB ARRAY SUM IS : "+maxSum);

    }
}
