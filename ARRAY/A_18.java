package DSA_150.ARRAY;

public class A_18 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int size = arr.length;
        int givensum = 10;
        int currsum = 0;
        boolean flag = false;
        for(int i = 0 ; i < size ; i++ ){
            for(int j = i +1 ; j < size ; j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(arr[k]+" ");
                    currsum = arr[k]+currsum;

                }
                if(currsum == givensum){
                   flag=true;
                }
                System.out.println();

                currsum = 0;
            }

        }
        if(flag){
            System.out.println("GIVEN SUM IS PRSENT");
        }

    }
}
