package ru.mirea.task13.opt3;

import java.util.Arrays;

public class KickingStruct<T> {
    private final int initialCapacity=10;
    private Object[] array;
    private int filledSize=0;

    public KickingStruct(int capacity){
        if(capacity>=0){
            array = new Object[capacity];
        }else{
            throw new IllegalArgumentException("Illegal Capacity: "+
                    capacity);
        }
    }

    public KickingStruct(){
        array=new Object[initialCapacity];
    }

    public void add(T newElem){
        if(filledSize== array.length){
            resize(array.length+1);
        }
        filledSize++;
        array[filledSize-1]=newElem;
    }

    public void add(T newElem, int index){
        if(filledSize== array.length){
            resize(array.length+1);
        }
        if(index<= filledSize){
            System.arraycopy(array, index, array, index + 1, array.length - 1 - index);
            array[index]=newElem;
            filledSize++;
        }else throw new IndexOutOfBoundsException("Index " + index+ " out of boundaries");

    }

    public void clear(){
        Arrays.fill(array, null);
        filledSize =0;
    }

    public T get(int index){
        if(index>filledSize) throw new IndexOutOfBoundsException("Index " + index+ " out of boundaries");
        return (T)array[index];
    }

    public void set(T newElem, int index){
        if(index>filledSize) throw new IndexOutOfBoundsException("Index " + index+ " out of boundaries");
        array[index]=newElem;
    }

    public void resize(int newSize){
        Object[] newArray=new Object[newSize];
        if(newSize> array.length){
            System.arraycopy(array,0,newArray,0,array.length);
        }
        if(newSize< array.length){
            System.arraycopy(array,0,newArray,0,newSize);
            if(newSize<filledSize) filledSize=newSize;
        }
        array=newArray;
    }

    public int size(){
        return filledSize;
    }

    public void delete(int index){
        System.arraycopy(array,index+1,array,index,filledSize-1-index);
        array[filledSize-1]=null;
        filledSize--;
    }

}
