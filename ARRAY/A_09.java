package DSA_150.ARRAY;

public class A_09 {
    public static void main(String args[]){
        int[] arr = {1,1,2,3,3,4,4,5,5};
        int size = arr.length;

        int j = 0 ;

        for(int i = 0 ; i < size  - 1 ; i++){     // WE DONT ITREATE THE LAST ELEMENT
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[size-1];   // PRINTING THE LAST ELEMENT BEACUSE ITS ALWAYS UNIQUE
        for(int i = 0 ; i < j ; i++){
            System.out.println(arr[i]);
        }
    }
}
