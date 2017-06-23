package Flexton;
import java.util.HashSet;
/**
 * Created by janish on 6/9/2017.
 */
public class ArrayAdditionInteger {
    public int[] getsum(int[] nums, int target){
        HashSet<Integer> sumsrr=new HashSet<Integer>();
        int[] res=new int[2];

        for(int i=0;i<nums.length;i++) {
            if(sumsrr.contains(nums[i])) {
                res[1]=nums[i];
                res[0]=target-nums[i];
            }
            else{
                sumsrr.add(target-nums[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {23, 12, 27, 15, 18, 7, 9, 10};
        int target = 45;
        int a[]=new int[2];
        ArrayAdditionInteger t = new ArrayAdditionInteger();

        a = t.getsum(nums, target);
        for(int i=0;i<a.length;i++)
        {System.out.println(a[i]);}
    }
}
