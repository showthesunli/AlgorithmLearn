/**
 * Created by showt on 2015/10/22.
 */
import java.util.Arrays;
public class MegreSort {
    public int[] megre(int []A,int p,int q,int r){
        int []B = new int[q - p + 1];
        for (int i=0,j=p;i<B.length;i++,j++){
            B[i] = A[j];
        }
        int []C = new int[r - q];
        for (int i=0,j=q+1;i<C.length;i++,j++){
            C[i] = A[j];
        }
        int n = B.length < C.length ? C.length:B.length;
        int pointIndex = p;
        for (int i=0,j=0,k=0;i<=n;i++,pointIndex++){
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

    public int[] solutation(int A[],int p ,int r){


        return null;
    }

    public static void main(String [] args){
        //int A[] = new int[] {2,3,5,7,10,11,13};
        int A[] = new int[] {7,10,11,1,2,3,5};
        new MegreSort().megre(A,0,2,6);
        for (int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }

    }
}
