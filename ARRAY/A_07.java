package DSA_150.ARRAY;

public class A_07 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int size = arr.length;
        boolean flag = true;
        for(int i = 0 ; i < size-1 ; i++){

            if(arr[i]>arr[i+1]) {
                flag = false;
            }
        }
        if (flag){
            System.out.println("ARAAY IS ALREADY SORTED");
        }
    }

}
