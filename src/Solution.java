public class Solution {

    public int rainWaterTrapped(int[] height) {
        /**
         * Initializing variables
         */
        int left = 0;
        int right = height.length - 1;
        /**
         * total units of water trapped in a valley between two peaks
         */
        int total = 0;
        /**
         * Current left max(so to say, left peak of the valley)
         */
        int leftMax = height[0];
        /**
         * Current right max(so to say, right peak of the valley)
         */
        int rightMax = height[right];
        /**
         * Loop thorugh
         */
        while (left < right) {
            /**
             * Check whih side has less height and work on that
             */
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                /**
                 * Check if we are in a valley
                 */
                if (leftMax - height[left] > 0) {
                    /**
                     * We are in a valley and we store some water over here
                     */
                    total = total + (leftMax - height[left]);
                }
                /**
                 * increase left pointer
                 */
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                /**
                 * Check if we are in a valley - Now from the right side
                 */
                if (rightMax - height[right] > 0) {
                    /**
                     * We are in a valley and we store some water over here
                     */
                    total = total + (rightMax - height[right]);
                }
                /**
                 * decrease right pointer
                 */
                right--;
            }
        }
        return total;
    }

}
