package firsttime;

/**
 * ������
 * Created by prototype on 2015/11/3.
 */
public class HeapSort {
    /**
     * ���ص�ǰi�ڵ�ĸ��ڵ�
     * @param i �����±�
     * @return ���ڵ��±�
     */
    public static int parent(int i){

        return i/2;
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
        return i*2+1;
    }

    /**
     * ��������
     * @param A ����������ȫ��������A[i]�����������������������ѣ�ʹA[i]Ϊ����Ķѳ�Ϊ����
     * @param i ����������ȫ�������Ķ��ڵ�
     * @param heapSize ��Ԫ���������е�����±�
     */
    public static void max_heapify(int [] A,int i,int heapSize){
        int l = left(i);
        int r = right(i);
        int largest;
        if (l<=heapSize-1 && A[l]>A[i]){
           largest = l;
        }else{
            largest = i;
        }
        if (r<=heapSize-1 && A[r]>A[largest]){
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
        for (int i=loopTimes-1;i>=0;i--){
            max_heapify(A,i,heapSize);
        }
    }

    /**
     * ������
     * wrong
     * @param A
    public static void heapSort(int []A,int heapSize){
        build_max_heap(A);
        int tmp = A[0];
        A[0] = A[heapSize -1 ];
        A[heapSize - 1] = tmp;
        //max_heapify(A,0,heapSize-1);
        if (heapSize-1>0){
            heapSort(A,heapSize-1);
        }
    }
     */
    public static void heapSort(int []A){
        int heapSize = A.length;
        build_max_heap(A);
        for (int i=0;i<heapSize;i++){
            int tmp = A[0];
            A[0] = A[heapSize - i - 1 ];
            A[heapSize - i - 1] = tmp;
            max_heapify(A,0,heapSize - i -1);
        }

    }

    public static void main(String [] args){
        int [] A = {1,3,3,5,3,7,3,4,9,6};
        int [] B = {1,3,3,5,3,7,3,4,9,6};
        build_max_heap(A);
        for (int i=0;i<A.length;i++){
            System.out.println(A[i]);
            if (left(i)<=A.length-1){
                System.out.print(A[left(i)]+" "+A[right(i)]);
                System.out.println();
            }
        }
        System.out.println("==========================");
        heapSort(B);
        for (int i=0;i<B.length;i++){
            System.out.println(B[i]);
        }

    }
}
