package DSA_150.ARRAY;

public class A_12 {
    public static void main(String[] args){
        int[]  arr = {0,1,3,4};  // n -> start from 0 so arr.lenght if 1 then arr.length +1
        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println(missing);
    }
}
