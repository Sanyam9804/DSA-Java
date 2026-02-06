package DSA_150.ARRAY;

public class A_04 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int size = arr.length;
        int key = 3;

        int start = 0 ;
        int end = size - 1;
        int index = -1;
        boolean flag = false;

        while (start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == key){
                flag = true;
                index = 0;
                break;
            }
            else if (arr[mid]<key) {
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        if(flag){
            System.out.println("FOUND");
        }
    }
}
