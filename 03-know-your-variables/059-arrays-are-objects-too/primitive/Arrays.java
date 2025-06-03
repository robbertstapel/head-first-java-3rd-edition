package primitive;

class Arrays {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        // this will be out of bounds because length is set to 3
        // nums[3] = 4;

        System.out.println(nums[0]);
        System.out.println(nums.getClass());
        // [I means Integer array...
        // We have to do it with that...
    }
}