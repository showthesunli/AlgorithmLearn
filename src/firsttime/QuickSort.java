package firsttime;

/**
 * Created by prototype on 2015/12/1.
 */
public class QuickSort {
    /**
     * quickSort
     * @param A 待排序数组
     * @param p 数组开始下标
     * @param r 数组结束下标
     * @throws Exception
     */
    public static void quicksort(int [] A,int p ,int r) {
        if (p<r){
            int q = partition(A,p,r);
            quicksort(A,p,q-1);
            quicksort(A,q+1,r);
        }else{
            System.out.println("p="+p+" r="+r);
            return;
        }
    }

    /**
     * 以A[r]作为主元素来排序，排序结果将A[r]的元素从新放在数组的某一位置，其中，此位置左侧的元素按全部小于A[r]，右侧的元素
     * 全部大于A[r]
     * @param A 待排序的数组
     * @param p 起始排序下标
     * @param r 结束排序下标
     * @return
     */
    public static int partition(int [] A,int p,int r){
        int x = A[r];
        //标识比A[r]小的元素区间最大下标
        int i = p-1;
        //交换元素空间
        int tmp = 0;
        //遍历数组需要排列的元素，将比A[r]小的元素都放在A[i]位置上
        for(int j=p;j<=r;j++){
            if (A[j]<x){
                i = i+1;
                tmp = A[j];
                A[j]=A[i];
                A[i]=tmp;
            }
        }
        //i+1的位置是最后排序好的A[r]的位置，其左侧元素都比A[r]小，右侧元素都比A[r]大
        tmp = x;
        A[r] = A[i+1];
        A[i+1] = tmp;
        return i+1;
    }


    public static void main(String [] args)  {
        int [] A = {2,8,7,3,5,6,4};
        quicksort(A,0,6);
        for (int b : A){
            System.out.println(b);
        }

    }
}
