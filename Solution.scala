object Solution {
    def runningSum(nums: Array[Int]): Array[Int] = {
        var sum: Int = 0;
        for (i <- 0 until nums.length) {
            sum = sum + nums(i);
            nums(i) = sum;
        }
        return nums;
    }
}