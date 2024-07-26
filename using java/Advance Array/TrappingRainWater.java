public class TrappingRainWater {
    public static void trappingRainWater(int number[]) {
        // max left
        int maxLeft = Integer.MIN_VALUE;
        int maxRight = Integer.MIN_VALUE;
        int max_left[] = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxLeft) {
                maxLeft = number[i];
                max_left[i] = maxLeft;
            }
            else{

            }
            System.out.println("left " + max_left[i]);

        }
        // max right
        int max_right[] = new int[number.length];
        for (int i = number.length-1; i >= 0; i--) {
            if (number[i] > maxRight) {
                maxRight = number[i];
                max_right[i] = maxRight;
            }
            System.out.println("right " + max_right[i]);
        }

    }

    public static void main(String[] args) {
        int num[]={4,2,0,6,3,2,5};
        trappingRainWater(num);
      

    }

}
