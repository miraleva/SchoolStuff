import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayCheck {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random = new Random();

        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100) + 1;
            if (nums[i] % 2 == 0) {
                evens.add(nums[i]);
            } else {
                odds.add(nums[i]);
            }
        }

        System.out.println("Original Array:" + Arrays.toString(nums));
        System.out.println("Even Count: " + evens.size() +" Even Numbers: "+ evens);
        System.out.println("Odd Count: " + odds.size() +" Odd Numbers: "+ odds);
    }
}