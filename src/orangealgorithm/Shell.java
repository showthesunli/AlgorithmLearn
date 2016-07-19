package orangealgorithm;

/**
 * shellSort
 * Created by prototype on 2016/7/5.
 */
public class Shell extends BaseTemplate {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j = j - h) {
                    exch(a, j, j - h);
                }
            }
            h = h/3;
        }
    }

    public static void main(String [] args){
        Integer []a = {new Integer(3),new Integer(1),new Integer(8),new Integer(5),new Integer(9)};
        Shell s = new Shell();
        s.sort(a);
        s.show(a);
    }
}
