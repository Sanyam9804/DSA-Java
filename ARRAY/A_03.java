package DSA_150.ARRAY;

public class A_03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int size = arr.length;
        int key = 3;
        int index=0;
        boolean flag = false;
        for(int i = 0 ; i < size ; i++){
            if(arr[i] == key){
                flag = true;
                index = 1+i;
            }
        }
        if(flag){
            System.out.println("VALUE FOUNT AT INDEX : "+index);
        }

    }
}
