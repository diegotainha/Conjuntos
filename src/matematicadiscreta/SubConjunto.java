package matematicadiscreta;

/**
 *
 * @author Diego
 */
public class SubConjunto {

    private Object A;
    private Object B;

    public SubConjunto() {
    }

    public SubConjunto(Object A, Object B) {
        this.A = A;
        this.B = B;
    }

    public Object getA() {
        return A;
    }

    public void setA(Object A) {
        this.A = A;
    }

    public Object getB() {
        return B;
    }

    public void setB(Object B) {
        this.B = B;
    }

    @Override
    public String toString() {
        return "<" + this.A + "," + this.B + ">";
    }
}
