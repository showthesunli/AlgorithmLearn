package turejava;

import turejava.element.Element;
import turejava.util.Util;

import java.util.*;

/**
 * 计数排序
 * 计数排序适用于范围不大的整数排序
 * Created by prototype on 2016/3/16.
 */
public class CountSort {

    /**
     * 计数排序
     * 给定元素x，找出小于等于x的元素的个数，将x直接放在输出元素的对应位置上
     *
     * @param A 待排序元素所在的原始数组
     * @param B 排序后的输出数组
     * @param k A中元素的范围
     */
    public void countSort(int[] A, int[] B, int k) {

        int[] C = new int[k];
        Arrays.fill(C, 0);
        //C的下标为A中的元素值，C的值为A中等于当前C下标的元素个数
        for (int i : A) {
            C[i]++;
        }
        //C的下标为A中的元素值，C的值为A中小于等于当前C下标的元素个数
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
