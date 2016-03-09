package turejava;

import turejava.element.Element;
import turejava.element.insertsortelement.InsertSortElement;

/**
 * ≤Â»Î≈≈–Ú
 * Created by prototype on 2016/3/3.
 */
public class InsertSort <T extends Element>{
    public T[] soluation(T[] A){
        for (int i=1;i<A.length;i++){
            T key = A[i];
            int j = i - 1;
            while (j>=0 && A[j].bigThan(A[j+1])){
                A[j+1] = A[j];
                A[j] = key;
                j--;
            }
        }
        return A;
    }

    public static void main(String [] args){
        Element<Integer>[] A = new Element[]{new InsertSortElement(5),new InsertSortElement(2),new InsertSortElement(4),new InsertSortElement(6)};
        new InsertSort<Element>().soluation(A);
        for (Element<Integer> key : A){
            System.out.println(key.getElementData());
        }

    }
}
