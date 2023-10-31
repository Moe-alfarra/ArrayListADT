import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.insert(ran.nextInt(100));
        }
        list.print();
        list.removeItemAt(8);
        list.print();

    }
}
