package turejava.util;

import turejava.element.Element;

/**
 * Created by prototype on 2016/3/15.
 */
public class Util {

    /**
     * exchange the elements of A which the elements index is q and r
     * @param A the array of those element
     * @param q element index
     * @param r element index
     * @param <T>
     * @return
     */
    public static <T> T[] exchange(T[] A,int q,int r){
        T tmp = A[q];
        A[q] = A[r];
        A[r] = tmp;
        return A;
    }

    /**
     * print the element of array with " "
     * @param A
     * @return
     */
    public static  void sysoArr(Element[] A){
        for (Element a : A){
            System.out.print(a.getElementData() + " ");
        }
        System.out.println();
    }
}
