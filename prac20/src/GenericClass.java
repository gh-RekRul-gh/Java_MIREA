import java.io.Serializable;

public class GenericClass<T extends Number, V extends Comparable, K> {
    T TParam;
    V VParam;
    K KParam;
    public T getTParam() {
        return TParam;
    }

    public V getVParam() {
        return VParam;
    }

    public K getKParam() {
        return KParam;
    }

    public GenericClass(T tParam, V vParam, K kParam) {
        this.TParam = tParam;
        this.VParam = vParam;
        this.KParam = kParam;
    }

    public void outputClassName(){
        System.out.println(TParam + " (" + TParam.getClass() + ")");
        System.out.println(VParam + " (" + VParam.getClass() + ")");
        System.out.println(KParam + " (" + KParam.getClass() + ")");
    }
}