package orangealgorithm;

/**
 * Created by prototype on 2016/7/5.
 */
public abstract class BaseTemplate {
    public abstract  void sort(Comparable[] a);

    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    public static void exch(Comparable []a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable []a){
        for (Comparable i : a){
            System.out.print(i);
        }
        System.out.println();
    }

    public static boolean isSort(Comparable []a){
        for (int i = 1;i < a.length;i++){
            if(less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }

}
