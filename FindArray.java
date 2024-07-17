import java.util.ArrayList;
import java.util.List;

public class FindArray {
    public static List<int[]> findIndexesWithSum(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;
        int currentSum = 0;
        List<int[]> indexes = new ArrayList<>();

        while (j < n) {
            currentSum += arr[j];

            while (currentSum > k) {
                currentSum -= arr[i];
                i++;
            }

            if (currentSum == k) {
                indexes.add(new int[]{i, j});
            }

            j++;
        }

        return indexes;
    }

    public static void main(String[] args) {
        int[] input = {10, 2, 5, 7, 1};
        int k = 13;
        List<int[]> result = findIndexesWithSum(input, k);

        if (result.size() > 0) {
            System.out.println("Output:");
            for (int[] indexes : result) {
                System.out.println("{" + indexes[0] + ", " + indexes[1] + "}");
            }
        } else {
            System.out.println("No such indexes found.");
        }
    }
}
