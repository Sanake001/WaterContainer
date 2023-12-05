public class Main {

    public static void main(String [] args){
        int [] arr = {1,1};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, area);
            ++i;
        }
        return maxArea;
    }

}
