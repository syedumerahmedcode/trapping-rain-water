import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given 'n' non-negative integers representing an elevation map where the width
         * of each bar is 1, compute how much water it can trap after a rainfall.
         * 
         * input:{0,1,0,2,1,0,1,3,2,1,2,1}
         * output: 6
         * Explanation: The above elevation map (black section in the leetcode question)
         * is represented by array {0,1,0,2,1,0,1,3,2,1,2,1}. In this case, 6 unit of
         * rain water(blue section in the leetcode question) are being trapped.
         */
        System.out.println("Hello, World!");
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        Solution solution = new Solution();
        int rainWaterTrapped = solution.rainWaterTrapped(height);
        System.out.println("The given heights are:" + Arrays.toString(height)
                + " and the total rain water trapped in the valleys is: " + rainWaterTrapped);
    }
}
