package turejava;

import java.util.HashMap;
import java.util.Map;

/**
 * 基数排序
 * 针对各个数字的每一位进行计数排序
 * Created by prototype on 2016/3/16.
 */
public class RadixSort {
    /**
     * 求i是几位数
     * @param i
     * @return
     */
    public int  numDigit(int i){
        if (i==0){
            return 1;
        }else {
            return (int) Math.log10(Math.abs(i))+1;
        }
    }

    /**
     * 求i的第d位数
     * @param i
     * @param d
     * @return
     */
    public  int getNumofDigits(int i,int d){
        int x = (int) ((i/Math.pow(10,d-1))%10);
        return x;
    }


    /**
     * 计数排序,排序范围为10，排序十进制数字
     * @param A 原始数据数组
     * @param d 需要排序的数字在原始数据的位数
     */
    public void countSort(int[] A, int d) {
        Map<Integer,Integer> map = new HashMap();
        for (int i=0;i<A.length;i++){
            map.put(i,A[i]);
        }

        int [] B = new int[A.length];
        for (int i=0;i<A.length;i++){
            B[i] = this.getNumofDigits(A[i],d);
        }

        //C,计数排序输出的数组
        int []C = new int[A.length];
        new CountSort().countSort(B,C,10);
    }


    /**
     * 基数排序
     * @param A 待排序的数组
     * @param d 原始数据中的数字最大位数
     */
    public void radixsort(int [] A,int d){
        for (int i=1;i<=d;i++){
            this.countSort(A,d);
        }
    }


    public static void main(String []args){

        int A[] = new int[]{36,9,0,25,1,49,64,16,81,4};
        RadixSort rs = new RadixSort();

        /*
        System.out.println(rs.numDigit(11111));

        for (int i=1;i<=5;i++){
            System.out.println(rs.getNumofDigits(12345, i));
        }
        */
        rs.radixsort(A,2);

    }
}
