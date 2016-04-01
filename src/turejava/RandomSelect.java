package turejava;
import firsttime.QuickSort;

/**
 * ���˳��ͳ��
 * Created by prototype on 2016/4/1.
 */
public class RandomSelect {

    /**
     * ���������еĵ�iС��Ԫ��
     * @param A ԭʼ����
     * @param p ԭʼԪ��������A����ʼ�±�
     * @param r ԭʼԪ��������A�Ľ����±�
     * @param i ˳����������iС��Ԫ��
     * @return
     */
    public int randomizedSelect(int []A,int p,int r,int i){
            int d = this.randomPation(A,p,r);
            if (p+i-1 == d){
                return A[d];
            }else if (p+i-1>d){
                return this.randomizedSelect(A,d+1,r,p+i-d+1);
            }else {
                return this.randomizedSelect(A,p,d-1,i);
            }
    }

    public int randomPation(int [] A,int p,int r){
        int ri = (int)(Math.random()*(r-p+1)+p);
        int tmp = A[r];
        A[r] =  A[ri];
        A[ri] = tmp;
        return QuickSort.partition(A,p,r);
    }

    public static void main(String [] args){
        int [] A = {1,2,3,4,5};
        System.out.println(new RandomSelect().randomizedSelect(A,0,4,3));
    }

}
