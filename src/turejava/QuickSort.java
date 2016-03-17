package turejava;

import turejava.element.Element;
import turejava.element.elementdef.InsertSortElement;
import turejava.util.*;


/**
 * øÏ≈≈–Ú
 * Created by prototype on 2016/3/15.
 */
public class QuickSort <T extends Element>{

    public int partition(T[] A,int p,int r){
            T ponitElement = A[r];
            int i = p-1;
            for (int j=p;j<=r-1;j++){
                if (ponitElement.bigThan(A[j])){
                    i++;
                    Util.exchange(A,i,j);
                }
            }
            Util.exchange(A,++i,r);
            return i;
    }

    public void quicksort(T[] A,int p,int r){
        if (p<r){
            int q = this.partition(A,p,r);
            this.quicksort(A,p,q-1);
            this.quicksort(A,q+1,r);
            return;
        }
    }


    public static void main(String [] args){
        Element<Integer> [] A = new Element[]{
                new InsertSortElement(2),
                new InsertSortElement(8),
                new InsertSortElement(7),
                new InsertSortElement(3),
                new InsertSortElement(5),
                new InsertSortElement(6),
                new InsertSortElement(4)};
        new QuickSort<Element>().quicksort(A,0,6);
        Util.sysoArr(A);
    }
}
