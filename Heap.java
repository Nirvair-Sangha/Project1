package com.company;

public class Heap<E extends Comparable<E>> {

    static int movements;
    static int comparisons;

    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public Heap() {
    }

    public Heap(E[] objects) {
        for(int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    public void add(E newObject) {
        list.add(newObject);
        int currentIndex = list.size() - 1;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;

            if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
                comparisons++;
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                movements++;
                list.set(parentIndex, temp);
                movements++;
            }
            else
                break;

            currentIndex = parentIndex;
        }
    }

    public E remove() {
        if (list.size() == 0) return null;

        E removedObject = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while (currentIndex < list.size()) {
            comparisons++;
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            if (leftChildIndex >= list.size()) {
                comparisons++;
                break;
            }
            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()) {
                comparisons++;
                if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
                    maxIndex = rightChildIndex;
                    comparisons++;
                }
            }

            if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
                comparisons++;
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                movements++;
                list.set(currentIndex, temp);
                movements++;
                currentIndex = maxIndex;
            } else
                break;
        }

        return removedObject;
        }

    public int getSize() {
        return list.size();
    }

    public int getComparisonsH() {
        return comparisons;
    }

    public int getMovementsH() {
        return movements;
    }
}
