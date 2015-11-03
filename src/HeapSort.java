/**
 * Created by prototype on 2015/11/3.
 */
public class HeapSort {
    /**
     * 返回当前i节点的父节点
     * @param i 数组下标
     * @return 父节点下标
     */
    public static int parent(int i){

        return (i+1)/2;
    }

    /**
     * 返回当前i节点的左子节点
     * @param i 数组下标
     * @return 左子节点下标
     */
    public static int left(int i){
        return (i+1)*2;
    }

    /**
     * 返回当前i节点的右子节点
     * @param i 数组下标
     * @return 右子节点下标
     */
    public static int right(int i){
        return (i+1)*2+1;
    }

    /**
     * 构建最大堆
     * @param A 待构建的完全二叉树，A[i]的左子树和右子树都是最大堆，使A[i]成为最大堆
     * @param i 待构建的完全二叉树的顶节点
     * @param heapSize 堆元素在数组中的最大下标
     */
    public static void max_heapify(int [] A,int i,int heapSize){
        int l = left(i);
        int r = right(i);
        int largest;
        if (l<=heapSize && A[l]>A[i]){
           largest = l;
        }else{
            largest = i;
        }
        if (r<=heapSize && A[r]>A[largest]){
            largest = r;
        }
        if (largest != i){
            int tmp = A[largest];
            A[largest] = A[i];
            A[i] = tmp;
            max_heapify(A,largest,heapSize);
        }
    }

    /**
     * 建堆，使A成为最大堆
     * @param A 待构建的原始二叉树
     */
    public static void build_max_heap(int []A){
        int heapSize = A.length;
        int loopTimes = heapSize/2;
        for (int i=0;i<loopTimes)

    }

    /**
     * 堆排序
     * @param A
     */
    public static void heapSort(int []A){

    }
}
