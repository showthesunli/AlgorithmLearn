package firsttime;

/**
 * ≤Â»Î≈≈–Ú
 * Created by showt on 2015/10/22.
 */
public class InsertSort {
    public int[] solutaion(int [] A){
        for (int i=1;i<A.length;i++){
            int key = A[i];
            int j = i - 1;
            while (j>=0 && key>A[j]){
               A[j+1] = A[j];
                A[j] = key;
                --j;
            }
        }
       return A;
    }

    public static void main(String [] args){
        int [] A = new int[] {5,2,4,6,1,3};
        new InsertSort().solutaion(A);
        for (int i=0;i<A.length;i++) {
            System.out.println(A[i]);
        }

    }
}
