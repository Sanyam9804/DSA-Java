package DSA_150.ARRAY;
import java.util.Scanner;
public class A_01 {

    public static int maxElement(int arr[],int size){
        int max = arr[0];

        for(int i = 1 ; i < size ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("LARGEST ELEMNT IS : "+max);
        return 0;
    }
    public static int minElement(int arr[],int size){
        int min = arr[0];

        for(int i = 1 ; i < size ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("SMALLEST ELEMNT IS : "+min);
        return 0;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];

        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        maxElement(arr,size);
        minElement(arr,size);
    }
}
