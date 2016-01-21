package firsttime;

/**
 * Created by prototype on 2015/12/1.
 */
public class QuickSort {
    /**
     * quickSort
     * @param A ����������
     * @param p ���鿪ʼ�±�
     * @param r ��������±�
     * @throws Exception
     */
    public static void quicksort(int [] A,int p ,int r) {
        if (p<r){
            int q = partition(A,p,r);
            quicksort(A,p,q-1);
            quicksort(A,q+1,r);
        }else{
            System.out.println("p="+p+" r="+r);
            return;
        }
    }

    /**
     * ��A[r]��Ϊ��Ԫ����������������A[r]��Ԫ�ش��·��������ĳһλ�ã����У���λ������Ԫ�ذ�ȫ��С��A[r]���Ҳ��Ԫ��
     * ȫ������A[r]
     * @param A �����������
     * @param p ��ʼ�����±�
     * @param r ���������±�
     * @return
     */
    public static int partition(int [] A,int p,int r){
        int x = A[r];
        //��ʶ��A[r]С��Ԫ����������±�
        int i = p-1;
        //����Ԫ�ؿռ�
        int tmp = 0;
        //����������Ҫ���е�Ԫ�أ�����A[r]С��Ԫ�ض�����A[i]λ����
        for(int j=p;j<=r;j++){
            if (A[j]<x){
                i = i+1;
                tmp = A[j];
                A[j]=A[i];
                A[i]=tmp;
            }
        }
        //i+1��λ�����������õ�A[r]��λ�ã������Ԫ�ض���A[r]С���Ҳ�Ԫ�ض���A[r]��
        tmp = x;
        A[r] = A[i+1];
        A[i+1] = tmp;
        return i+1;
    }


    public static void main(String [] args)  {
        int [] A = {2,8,7,3,5,6,4};
        quicksort(A,0,6);
        for (int b : A){
            System.out.println(b);
        }

    }
}
