import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountSmaller {
    static List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            int c = Collections.binarySearch(temp, nums[i]);
            if (c < 0) c = -c - 1;
            ans.add(c);
            temp.add(c, nums[i]);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(countSmaller(arr));
    }
}
