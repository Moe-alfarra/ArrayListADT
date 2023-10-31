public class ArrayList {

    private int length;
    private static final int SIZE = 10;
    private int[] list = new int[SIZE];

    public ArrayList() {
        length = 0;
    }

    public ArrayList(int length) {
        this.length = length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.println(list[i] + " ");
        }
        System.out.println();
    }

    public void insert(int x) {
        if (length == SIZE) {
            System.out.println("list is full!");
        }
        else {
            list[length] = x;
            length++;
        }
    }

    public void removeItemAt(int pos) {
        for (int i = 0; i < length; i++) {
            list[i] = list[i+1];
            length--;
        }
    }
}
