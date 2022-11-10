package chapters.chapter_10;

public class Queue {

    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] tempArray = new int[elements.length * 2];
            System.arraycopy(elements, 0, tempArray, 0, elements.length);
            elements = tempArray;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int number = elements[0];

        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return number;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
