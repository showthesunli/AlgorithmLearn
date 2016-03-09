package turejava.element;

/**
 * Created by prototype on 2016/3/3.
 */
public interface Element <T> {

    public boolean bigThan (Element<T> compareTo);
    public boolean smallerThan (Element<T> compareTo);
    public T getElementData();
}
