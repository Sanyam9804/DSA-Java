package DSA_150.ARRAY;

public class A_25 {
    public static void main(String[] args){
        int[] arr = {11,23,24,65,34,55,67};
        int size = arr.length;
        int countEVEN = 0 ;
        int countODD = 0;

        for(int i = 0 ; i < size ; i++){
            if(arr[i] % 2 ==0){
                countEVEN++;
            }
            else {
                countODD++;
            }
        }
        System.out.println("TOTAL EVEN NUMBER IS : "+countEVEN);
        System.out.println("TOTAL ODD NUMBER IS : "+countODD);
    }
}
