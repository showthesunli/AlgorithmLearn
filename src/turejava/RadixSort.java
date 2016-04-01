package turejava;

import java.util.HashMap;
import java.util.Map;

/**
 * ��������
 * ��Ը������ֵ�ÿһλ���м�������
 * Created by prototype on 2016/3/16.
 */
public class RadixSort {
    /**
     * ��i�Ǽ�λ��
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
     * ��i�ĵ�dλ��
     * @param i
     * @param d
     * @return
     */
    public  int getNumofDigits(int i,int d){
        int x = (int) ((i/Math.pow(10,d-1))%10);
        return x;
    }


    /**
     * ��������,����ΧΪ10������ʮ��������
     * @param A ԭʼ��������
     * @param d ��Ҫ�����������ԭʼ���ݵ�λ��
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

        //C,�����������������
        int []C = new int[A.length];
        new CountSort().countSort(B,C,10);
    }


    /**
     * ��������
     * @param A �����������
     * @param d ԭʼ�����е��������λ��
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
