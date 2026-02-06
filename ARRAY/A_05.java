package DSA_150.ARRAY;

public class A_05 {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,12,43,9,8,7};
        int size = arr.length;

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i =0 ; i < size ; i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != firstMax){
                secondMax = arr[i];
            }
        }
        System.out.println("LARGEST ELEMENT IS :"+firstMax);
        System.out.println("SECOND LARGEST ELEMENT IS :"+secondMax);
    }
}
