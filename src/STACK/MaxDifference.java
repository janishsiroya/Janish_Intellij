package STACK;

/**
 * Created by janish on 7/14/2017.
 */
public class MaxDifference {
    public static void main(String[] args) {
        int a[] = {2,4,5,8};
        int diff = 0;
        int result;
        int max;
        for (int i=0;i<a.length; i++){
            for (int j=1; j<a.length; j++){
                if (a[i] < a[j]){
                    result = a[j] - a[i];
                }
                else {
                    result = a[i] - a[j];
                }
                max = result-diff;
                System.out.println(max);
            }
        }
    }
}
