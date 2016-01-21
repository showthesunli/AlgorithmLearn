package firsttime;

import java.util.Arrays;

/**
 * ��������
 * Created by prototype on 2016/1/20.
 */
public class CountSort {

    /**
     * ��������
     * @param A ����������
     * @param k ������Ԫ�����ֵ,Ԫ��ȡֵ��Χ��0-k
     * @return ������������
     */
    public static int [] countSort(int [] A,int k){
        int n = A.length;
        int []C = new int[k+1];
        Arrays.fill(C,0);
        int []B = new int[n];
        for (int i=0;i<n;i++){
            C[A[i]]++;
        }
        int index = 0;
        for (int j=0;j<k+1;j++){
            for (int m=0;m<C[j];m++){
                B[index + m] = j;
            }
            index += C[j];
        }
        return B;
    }

    public static void main(String []args){
        int []A = {7,7,6,6,7,4,4,5,4,5,5};
        System.out.println(Arrays.toString(countSort(A,7)));
    }
}
