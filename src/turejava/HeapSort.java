package turejava;

import turejava.element.Element;
import turejava.element.elementdef.InsertSortElement;

/**
 * 堆排序
 * Created by prototype on 2016/3/9.
 */
public class HeapSort<T extends Element> {
    /**
     * 返回当前i节点的父节点
     *
     * @param i 数组下标
     * @return 父节点下标
     */
    private int parent(int i) {
        return (i - 1) / 2;
    }

    /**
     * 返回数组中下标为i的节点的左儿子节点下标
     *
     * @param i 数组下标
     * @return 左儿子节点下标
     */
    private int left(int i) {
        return 2 * i + 1;
    }

    /**
     * 返回数组中下标为i的节点的右儿子节点下标
     *
     * @param i 数组下标
     * @return 右儿子节点下标
     */
    private int right(int i) {
        return 2 * (i + 1);
    }


    /**
     * 假设i的左子树和右子树都是最大堆，保持最大堆的性质,即:使堆顶点的元素下降
     *
     * @param A
     * @param i
     * @param heapSizeIndex 最大堆的边界下标
     * @return
     */
    public T[] maxHeapFiy(T[] A, int i, int heapSizeIndex) {
        int left = this.left(i);
        int right = this.right(i);
        int largest = i;
        if (left <= heapSizeIndex && A[i].smallerThan(A[left])) {
            largest = left;
        }
        if (right <= heapSizeIndex && A[largest].smallerThan(A[right])) {
            largest = right;
        }
        if (largest != i) {
            T swapTmp = A[i];
            A[i] = A[largest];
            A[largest] =  swapTmp;
            maxHeapFiy(A, largest, heapSizeIndex);
        }
        return A;
    }

    /**
     * 建堆，将数组A构建成最大堆
     *
     * @param A 元素数组
     * @return
     */
    public T[] buildMaxHeap(T[] A, int heapSizeIndex) {
        for (int i = (heapSizeIndex-1)/2; i >= 0; i--) {
            this.maxHeapFiy(A, i, heapSizeIndex);
        }
        return A;
    }

    /**
     * 堆排序
     *
     * @param A
     * @return
     */
    public T[] heapSort(T[] A) {
        int heapSizeIndex = A.length - 1;
        this.buildMaxHeap(A, heapSizeIndex);
        T tmp;
        for (; heapSizeIndex>=0 ; ) {
            tmp = A[heapSizeIndex];
            A[heapSizeIndex] = A[0];
            A[0] = tmp;
            heapSizeIndex--;
            this.maxHeapFiy(A, 0, heapSizeIndex);
        }
        return A;
    }

    public static void main(String[] args) {
//        int [] A = {1,3,3,5,3,7,3,4,9,6};
        Element<Integer>[] A = new InsertSortElement[]{new InsertSortElement(1), new InsertSortElement(3), new InsertSortElement(3), new InsertSortElement(5), new InsertSortElement(3), new InsertSortElement(7), new InsertSortElement(3)};
        HeapSort<Element> hs = new HeapSort();
        hs.heapSort(A);
        for (Element<Integer> a : A) {
            System.out.print(a.getElementData() + " ");
        }
        System.out.println();

    }

}
