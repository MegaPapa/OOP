package oop_tasks;


public class TArray<T> {
    private T[] array = null;
    private int maxSize = -1, count = 0;
    
    public T[] getArray() {
        return array;
    }
    
    public void clear() {
        array = null;
        maxSize = -1;
        count = 0;
    }
    
    public void sort() {
        T firstElement = null,secondElement = null;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < i; j++){
                if ((array[j] == null) && (firstElement == null)) {
                    firstElement = array[j];
                }
                if ((array[j] == null) && (firstElement != null) && (secondElement == null)) {
                    secondElement = array[j];
                }
                if (firstElement == secondElement) {
                    T tmp = firstElement;
                    firstElement = array[j+1];
                    array[j+1] = tmp;
                    firstElement = null;
                    secondElement = null;
                }
            }
        }
    }
    
    public int find(T obj) {
        int i = 0;
        for (T value : array) {
            if (value == obj)
                return i;
            i++;
        }
        return -1;
    }
    
    private void checkIndex(int index) {
        if (index > maxSize) {
            throw new IndexOutOfBoundsException("Incorrect index");
        }
    }
    
    public void add(T element){
        add(element,maxSize + 1);
    }
    
    public void add(T element,int index){
        if (index > maxSize) {
            maxSize = index;
            array = expantion(array);
            count++;
        }
        array[index] = element;
    }
    
    private T[] expantion(T[] origArray){
        
        T[] newArray = (T[])(new Object[maxSize + 1]);
        if (origArray != null)
            System.arraycopy(origArray, 0, newArray, 0, origArray.length);
        origArray = newArray;
        return origArray;
    }
    
    public void delete(int index) {
        checkIndex(index);
        array[index] = null;
        count--;
    }
    
    public T get(int index) {
        checkIndex(index);
        return array[index];
    }
    
    public int getReserved(){
        return count;
    }
    
    public int getSize(){
        return array.length;
    }
    
}
