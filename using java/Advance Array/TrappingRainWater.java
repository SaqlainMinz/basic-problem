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
                max_left[i]=Math.max(max_left[i-1],max_left[i]);
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
            else{
                max_right[i]=Math.max(max_right[i+1],max_right[i]);
            }
            System.out.println("right " + max_right[i]);
        }
        //water level
        int waterlevel[]=new int[number.length];
        int trapWater[]=new int[number.length];
        for (int i = 0; i < number.length; i++) {
            waterlevel[i]=Math.min(max_left[i], max_right[i]);
            trapWater[i]=(waterlevel[i]-number[i]);
            System.out.println("trapwater "+trapWater[i]);
        }

    }

    public static void main(String[] args) {
        int num[]={4,2,0,6,3,2,5};
        trappingRainWater(num);
      

    }

}
