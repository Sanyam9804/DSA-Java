package DSA_150.ARRAY;

public class A_13 {
    public static void main(String args[]){
        int[] arr = {1,2,3,1,2,1,2};
        int size = arr.length;
        boolean[] visited = new boolean[size];
        for(int i = 0 ; i < size; i++){
            for(int j = i + 1  ; j  <size ; j++){
                if(visited[i]){
                    continue;
                }
                else if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    visited[j] = true;
                    break;
                }

            }
        }
    }
}
