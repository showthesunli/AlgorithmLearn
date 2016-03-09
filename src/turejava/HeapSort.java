package turejava;

import turejava.element.Element;
import turejava.element.insertsortelement.InsertSortElement;

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
     * 保持最大堆的性质，即使堆顶点的元素下降
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
            A[i] = A[largest];
            maxHeapFiy(A, largest, heapSizeIndex-largest);
        }
        return A;
    }

    /**
     * 将数组A构建成最大堆
     *
     * @param A 元素数组
     * @return
     */
    public T[] buildMaxHeap(T[] A, int heapSizeIndex) {
        for (int i = heapSizeIndex/2; i >= 0; i--) {
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
        for (int i = heapSizeIndex; i >=0 ; i--) {
            tmp = A[heapSizeIndex];
            A[heapSizeIndex] = A[i];
            A[i] = tmp;
            this.maxHeapFiy(A, i, heapSizeIndex - i);
        }
        return A;
    }

    public static void main(String[] args) {
//        int [] A = {1,3,3,5,3,7,3,4,9,6};
        Element<Integer>[] A = new InsertSortElement[]{new InsertSortElement(1), new InsertSortElement(3), new InsertSortElement(3), new InsertSortElement(5), new InsertSortElement(3), new InsertSortElement(7), new InsertSortElement(3)};
        HeapSort<Element> hs = new HeapSort();
        hs.heapSort(A);
        for (Element<Integer> a : A) {
            System.out.println(a.getElementData());
        }

    }

}
