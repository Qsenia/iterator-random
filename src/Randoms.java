import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;
    Random random = new Random(5);

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> getIterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return min + random.nextInt(max - min);
            }
        };
    }
}
