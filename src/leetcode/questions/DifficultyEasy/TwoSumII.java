package leetcode.questions.DifficultyEasy;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        if(numbers == null || numbers.length <= 0) return new int[]{0, 0};

        int arrayLength = numbers.length;
        int start = 0;
        int end = arrayLength - 1;
        int[] result = new int[2];

        while(end < arrayLength && end > 0 && start < arrayLength)
        {
            if(start == end)
                return new int[]{0,0};

            int sum = numbers[start] + numbers[end];

            if(sum == target)
            {
                result[0] = start + 1;
                result[1] = end + 1;
                return result;
            }

            if(sum > target)
                end--;
            else
                start++;
        }

        return result;
    }
}
