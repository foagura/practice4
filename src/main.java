public class main {
    public static void main(String[] args){
        int num = 10;
        int num2 = num;

        /* 変数に変数を代入する場合、代入元の値を代入先にコピーする。
        　　そのため、仮にどちらか一方に値を再代入しても、もう一方の値は変わらない。　*/
        System.out.println(num + num2);
        num2 = 50;
        System.out.println(num + num2);

        int[] nums = {10};
        int[] nums2 = nums;

        /* 配列を配列に代入する場合、代入元が参照する値のアドレスをコピーする形になる
        　　そのため、どちらか一方に値を再代入すると、代入元・代入先両方が再代入した値になる。　*/
        System.out.println("numsの値:" + nums[0] + "nums2の値:" + nums2[0]);
        nums2[0] = 50;
        System.out.println("numsの値:" + nums[0] + "nums2の値:" + nums2[0]);
        nums[0] = 200;
        System.out.println("numsの値:" + nums[0] + "nums2の値:" + nums2[0]);
    }
}
