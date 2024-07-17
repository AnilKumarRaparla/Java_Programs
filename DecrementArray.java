
public class DecrementArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        // Reverse the array
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }

        for (int num : reversedArr) {
            num--; 
            num--;
            System.out.print(num + " ");
        }
        
    }
}
