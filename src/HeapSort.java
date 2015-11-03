/**
 * Created by prototype on 2015/11/3.
 */
public class HeapSort {
    /**
     * ���ص�ǰi�ڵ�ĸ��ڵ�
     * @param i �����±�
     * @return ���ڵ��±�
     */
    public static int parent(int i){

        return (i+1)/2;
    }

    /**
     * ���ص�ǰi�ڵ�����ӽڵ�
     * @param i �����±�
     * @return ���ӽڵ��±�
     */
    public static int left(int i){
        return (i+1)*2;
    }

    /**
     * ���ص�ǰi�ڵ�����ӽڵ�
     * @param i �����±�
     * @return ���ӽڵ��±�
     */
    public static int right(int i){
        return (i+1)*2+1;
    }

    /**
     * ��������
     * @param A ����������ȫ��������A[i]�����������������������ѣ�ʹA[i]��Ϊ����
     * @param i ����������ȫ�������Ķ��ڵ�
     * @param heapSize ��Ԫ���������е�����±�
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
     * ���ѣ�ʹA��Ϊ����
     * @param A ��������ԭʼ������
     */
    public static void build_max_heap(int []A){
        int heapSize = A.length;
        int loopTimes = heapSize/2;
        for (int i=0;i<loopTimes)

    }

    /**
     * ������
     * @param A
     */
    public static void heapSort(int []A){

    }
}
