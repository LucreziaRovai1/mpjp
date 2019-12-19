package s073;

public class Tail {
    private int size;//voglio che la mia size rimanga sempre quella, quindi private

    public Tail(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Tail [size=" + size + "]";
    }
}
