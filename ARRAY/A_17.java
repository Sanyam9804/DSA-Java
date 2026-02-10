package DSA_150.ARRAY;

public class A_17 {
    public static void main(String args[]){
        int[] arr = {1,2,5,2,1,3};
        int size = arr.length;

        for(int i = 0 ; i < size ; i++){

            boolean flag = true;   // assume leader

            for(int j = i+1 ; j < size ; j++){
                if(arr[j] > arr[i]){
                    flag = false;  // not a leader
                    break;
                }
            }

            if(flag){
                System.out.println("LEADER ELEMENT IS : " + arr[i]);
            }
        }
    }
}
