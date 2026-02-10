package DSA_150.ARRAY;

public class A_20 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int size = arr.length;
        int[] prefixArr = new int[size];;
        int sum = 0 ;
        for(int i = 0 ; i < size ; i++){
            sum = arr[i]+sum;
            prefixArr[i] = sum;
        }
        for(int j = 0 ; j <size ;j++){
            System.out.println(prefixArr[j]);
        }
    }
}
