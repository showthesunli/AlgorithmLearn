package turejava;

import turejava.element.Element;
import turejava.util.Util;

import java.util.*;

/**
 * ��������
 * �������������ڷ�Χ�������������
 * Created by prototype on 2016/3/16.
 */
public class CountSort {

    /**
     * ��������
     * ����Ԫ��x���ҳ�С�ڵ���x��Ԫ�صĸ�������xֱ�ӷ������Ԫ�صĶ�Ӧλ����
     *
     * @param A ������Ԫ�����ڵ�ԭʼ����
     * @param B �������������
     * @param k A��Ԫ�صķ�Χ
     */
    public void countSort(int[] A, int[] B, int k) {

        int[] C = new int[k];
        Arrays.fill(C, 0);
        //C���±�ΪA�е�Ԫ��ֵ��C��ֵΪA�е��ڵ�ǰC�±��Ԫ�ظ���
        for (int i : A) {
            C[i]++;
        }
        //C���±�ΪA�е�Ԫ��ֵ��C��ֵΪA��С�ڵ��ڵ�ǰC�±��Ԫ�ظ���
        for (int m = 1; m < k; m++) {
            C[m] = C[m] + C[m - 1];
        }

        for (int j = 0; j < A.length; j++) {
            B[C[A[j]] - 1] = A[j];
            C[A[j]] = C[A[j]] - 1;
        }

    }

    public static void main(String[] args) {

        int[] A = {7, 7, 6, 6, 7, 4, 4, 5, 4, 5, 5};
        int[] B = new int[11];
        Arrays.fill(B, 0);
        new CountSort().countSort(A, B, 10);
        for (int i : B) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
