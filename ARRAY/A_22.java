package DSA_150.ARRAY;

public class A_22 {
    public static void main(String[] args){

        int[] arr = {1,2,1,2,0,0,1,2,0};
        int size = arr.length;

        int countZERO = 0;
        int countONE = 0;
        int countTWO = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) countZERO++;
            else if (arr[i] == 1) countONE++;
            else countTWO++;
        }

        int[] finalARR = new int[size];
        int index = 0;

        for (int i = 0; i < countZERO; i++) {
            finalARR[index++] = 0;
        }

        for (int i = 0; i < countONE; i++) {
            finalARR[index++] = 1;
        }

        for (int i = 0; i < countTWO; i++) {
            finalARR[index++] = 2;
        }

        for (int x : finalARR) {
            System.out.print(x + " ");
        }
    }
}
