package DSA_150.ARRAY;

import java.util.HashSet;

public class A_23 {
    public static void main(String[] args){

        int[] arr = {1,2,3,1,2};
        int size = arr.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < size ; i++){
            if(set.contains(arr[i])){
                System.out.println("FIRST REPEATING ELEMENT IS : " + arr[i]);
                return;
            }
            set.add(arr[i]);
        }

        System.out.println("NO REPEATING ELEMENT");
    }
}
