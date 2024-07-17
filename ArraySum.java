public class ArraySum{

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 9, 10, 11};
        calculateAndPrintAdjacentSums(array);
    }

    public static void calculateAndPrintAdjacentSums(int[] array) {
        if(array.length%2==0)
        {
        for (int i = 0; i < array.length-1; i++) {
            int sum = array[i] + array[i + 1];
            System.out.print(" "+sum);
        }
    }
    else{
        for (int i = 0; i < array.length - 1; i++) {
            int sum = array[i] + array[i + 1];
        i++;
            System.out.print(" "+sum);
        }
    }
    }
}
