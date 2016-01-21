package firsttime;

import java.util.Arrays;

/**
 * 计数排序
 * Created by prototype on 2016/1/20.
 */
public class CountSort {

    /**
     * 计数排序
     * @param A 待排序数组
     * @param k 待排序元素最大值,元素取值范围是0-k
     * @return 完成排序的数组
     */
    public static int [] countSort(int [] A,int k){
        int n = A.length;
        int []C = new int[k+1];
        Arrays.fill(C,0);
        int []B = new int[n];
        for (int i=0;i<n;i++){
            C[A[i]]++;
        }
        int index = 0;
        for (int j=0;j<k+1;j++){
            for (int m=0;m<C[j];m++){
                B[index + m] = j;
            }
            index += C[j];
        }
        return B;
    }

    public static void main(String []args){
        int []A = {7,7,6,6,7,4,4,5,4,5,5};
        System.out.println(Arrays.toString(countSort(A,7)));
    }
}
