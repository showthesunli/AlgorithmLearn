package turejava.element.elementdef;

import turejava.element.Element;

/**
 * Created by prototype on 2016/3/3.
 */
public class InsertSortElement implements Element<Integer> {

    private int data;

    public InsertSortElement(int data) {
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
