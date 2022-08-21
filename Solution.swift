class Solution {
    func runningSum(_ nums: [Int]) -> [Int] {
        var updated: [Int] = []
        var sum: Int = 0
        for i in nums {
            sum += i
            updated.append(sum)
        }
        return updated
    }
}
