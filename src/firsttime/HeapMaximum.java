package firsttime;

/**
 * ���ȼ�����
 * Created by showt on 2015/11/10.
 */
public class HeapMaximum {
    /**
     * ���ض������Ԫ��
     * @param A ������
     * @return
     */
    public static int heapMaxiMum(int []A){
        return A[0];
    }

    /**
     * ���ز�ɾ������Ԫ��
     * @param A ������
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
