package turejava;
import firsttime.QuickSort;

/**
 * 随机顺序统计
 * Created by prototype on 2016/4/1.
 */
public class RandomSelect {

    /**
     * 返回数组中的第i小的元素
     * @param A 原始数组
     * @param p 原始元素在数组A的起始下标
     * @param r 原始元素在数组A的结束下标
     * @param i 顺序索引，第i小的元素
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
        if (p==r){
            return p;
        }
        int ri = (int)(Math.random()*(r-p+1)+p);
        int tmp = A[r];
        A[r] =  A[ri];
        A[ri] = tmp;
        int x = QuickSort.partition(A,p,r);
        return x;
    }

    public static void main(String [] args){
        int [] A = {1,2,3,4,5};
        System.out.println(new RandomSelect().randomizedSelect(A,0,4,3));
    }

}
