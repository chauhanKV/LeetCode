package leetcode.DataStructuresArrays;

public class FlippingImage {

    //Runtime: 1 ms, faster than 67.80% of Java online submissions for Flipping an Image.
    //Memory Usage: 45.2 MB, less than 24.45% of Java online submissions for Flipping an Image.
    //Next challenges:
    //Best Time to Buy and Sell Stock III
    //Global and Local Inversions
    //Rotating the Box

    // Can I flip 0 to 1 in reverse function only ? to reduce TC.

    // Brute force Time Complexity : O(N^2)
    // Space Complexity : O(1)
    public int[][] flipAndInvertImage(int[][] image) {
        // reverse the array
        reverseArray(image);

        // invert the array
        invertArray(image);

        return image;
    }

    private void reverseArray(int[][] image)
    {
        int left, right;

        // TC => O(N)
        for(int i = 0; i < image.length; i++)
        {
            left = 0;
            right = image.length - 1;

            while(left < right)
            {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    private void invertArray(int[][] image)
    {
        // TC => O(N^2)
        for(int i = 0 ; i < image.length; i++)
        {
            for(int j = 0 ; j < image[i].length; j++)
            {
                image[i][j] = image[i][j] == 0 ? 1 : 0;
            }
        }
    }
}
