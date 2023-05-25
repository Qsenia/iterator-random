import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Randoms randoms = new Randoms(50, 90);
        Iterator<Integer> iterator = randoms.getIterator();
        System.out.println("Ваше случайное число: ");
        while (iterator.hasNext()) ;
        System.out.println(iterator.next());

    }
}

