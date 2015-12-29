package firsttime;

/**
 * 优先级队列
 * Created by showt on 2015/11/10.
 */
public class HeapMaximum {
    /**
     * 返回堆中最大元素
     * @param A 堆数组
     * @return
     */
    public static int heapMaxiMum(int []A){
        return A[0];
    }

    /**
     * 返回并删除最大堆元素
     * @param A 堆数组
     * @return
     */
    public static int heapExtractMax(int [] A) throws Exception {
        if (A.length < 1){
            throw new Exception("heap underflow");
        }
        int tmp = A[0];
        A[0] = A[A.length-1];
        A[A.length-1] = tmp;
        HeapSort.max_heapify(A,0,A.length-1);
        return A[A.length-1];
    }
}
