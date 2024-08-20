import java.util.function.Predicate;

public class ContestMethods {
    public int leftBinSearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        Predicate<Integer> predicate = x -> nums[x] >= target;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (predicate.test(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return target == nums[l] ? l : -1;
    }

    public int rightBinSearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        Predicate<Integer> predicate = x -> nums[x] <= target;
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            if (predicate.test(mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return target == nums[l] ? l : -1;
    }
}
