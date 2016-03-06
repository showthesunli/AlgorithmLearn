package turejava;

/**
 * Created by prototype on 2016/3/3.
 */
public class insertSortElement implements Element <Integer>{

    private int data;

    public insertSortElement(int data) {
        this.data = data;
    }


    public boolean bigThan(Element <Integer>compareTo) {
        int localData = getElementData().intValue();
        int compareData = compareTo.getElementData().intValue();
        boolean ret = localData>compareData?true:false;
        return ret;
    }

    public boolean smallerThan(Element<Integer> compareTo) {
        int localData = getElementData().intValue();
        int compareData = compareTo.getElementData().intValue();
        boolean ret = localData>compareData?false:true;
        return ret;
    }

    public Integer getElementData() {
        return this.data;
    }
}
