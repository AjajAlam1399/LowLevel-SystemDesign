package modle;

public class Entery<S,T> {
    S key;
    T value;
    Entery next;

    public Entery(S key, T value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public S getKey() {
        return key;
    }

    public void setKey(S key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Entery getNext() {
        return next;
    }

    public void setNext(Entery next) {
        this.next = next;
    }
}
