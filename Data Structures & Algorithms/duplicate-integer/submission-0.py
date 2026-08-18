class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        length = len(nums)
        for i in range(0,length):
            for j in range(i+1, length):
                if nums[i] == nums[j]:
                    return True
                    break

        return False