/**
 * Created by showt on 2015/10/22.
 */
public class MegreSort {
    public static int[] megre(int []A,int p,int q,int r){
        int []B = new int[q - p + 1];
        for (int i=0,j=p;i<B.length;i++,j++){
            B[i] = A[j];
        }
        int []C = new int[r - q];
        for (int i=0,j=q+1;i<C.length;i++,j++){
            C[i] = A[j];
        }
//        int n = B.length < C.length ? B.length:C.length;
        int n = r - p + 1;
        int pointIndex = p;
        for (int i=0,j=0,k=0;i<n;i++,pointIndex++){
            if (B.length==j){
                for (;pointIndex<r;pointIndex++,k++){
                    A[pointIndex] = C[k];
                }
                break;
            } else if (C.length == k){
                for (;pointIndex<=r;pointIndex++,j++){
                    A[pointIndex] = B[j];
                }
                break;
            } else {
                if (B[j]<=C[k]) {
                    A[pointIndex] = B[j];
                    j++;
                }else {
                    A[pointIndex] = C[k];
                    k++;
                }
            }
        }
        return A;
    }

    public static int[] solutation(int A[],int p ,int r){
        if (p<r){
            int n = (p+r)/2;
            //int n = p + ((r-p)/2);
            MegreSort.solutation(A,p,n);
            MegreSort.solutation(A,n+1,r);
            MegreSort.megre(A,p,n,r);
        }
        return A;
    }

    public static void main(String [] args){
        //int A[] = new int[] {2,3,5,7,10,11,13};
        //int A[] = new int[] {7,10,11,1,2,3,5};
        //new MegreSort().megre(A,0,2,6);
        //for (int i=0;i<A.length;i++){
            //System.out.println(A[i]);
        //}
        int A[] = new int[] {7,1,32,1,2,0,5};
        MegreSort.solutation(A,0,6);
//        int A[] = new int[] {1,1,7,32,0,2,5};
//        int p = 0,n=3,r=6;
//        MegreSort.megre(A,p,n,r);

        for (int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }

    }
}
