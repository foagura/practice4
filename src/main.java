public class main {
    public static void main(String[] args){
        int num = 10;
        int num2 = num;

        System.out.println(num + num2);
        num2 = 50;
        System.out.println(num + num2);

        int[] nums = {10};
        int[] nums2 = nums;

        System.out.println("numsの値:" + nums[0] + "nums2の値:" + nums2[0]);
        nums2[0] = 50;
        System.out.println("numsの値:" + nums[0] + "nums2の値:" + nums2[0]);
    }
}
