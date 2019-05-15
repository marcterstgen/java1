package a.b.c;

import jdk.nashorn.internal.ir.ReturnNode;

import java.util.Arrays;

public class MySequenceimpl implements ISequence {
    private Object[] elem;
    private int UsedSize;//有效数据个数
    private static final int DEFAULT_SIZE = 10;
    public MySequenceimpl(){
        this.elem = new Object[DEFAULT_SIZE];
        this.UsedSize = 0;
    }
    private boolean isFull() {
        return this.UsedSize == this.elem.length;
    }

    @Override
    public boolean add(int pos, Object data) {
        //1.pos位置的合法性进行判断。
        //2.判断是否为满。
        if(pos < 0 || pos > this.UsedSize){
            return false;
        }
        if(isFull()){
           this.elem = Arrays.copyOf(this.elem , 2*this.elem.length);
        }
        for ( int i = this.UsedSize - 1; i >= pos ; i-- ){
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.UsedSize++;
        return true;

    }
    private boolean isEmpty(){
        return this.UsedSize == 0;
    }

    @Override
    public int search(Object key) {
        if(isEmpty()){
            return  -1;
        }
        for(int i = 0 ;i <this.UsedSize; i++){
            if(this.elem[i].equals(key)){
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean contains(Object key) {
        if(isEmpty()){
            return  false;
        }
        for(int i = 0 ;i <this.UsedSize; i++){
            if(this.elem[i].equals(key)){
                return true;
            }
        }

        return false;
    }

    @Override
    public Object getPos(int pos) {
        if(pos < 0|| pos >= this.UsedSize){
            return null;
            }
        return this.elem[pos];
    }

    @Override
    public Object remove(Object key) {
        int index = search(key);
        if(index ==  -1){
            return null;
        }
        int i;
        Object data = this.elem[index];
        for(i = index ;i < this.UsedSize -1 ; i++){
            this.elem[i] =this.elem[i+1];
        }
        this.UsedSize--;
        this.elem[i+1]=null;
        return data;
    }

    @Override
    public int size() {
        return this.UsedSize;
    }

    @Override
    public void display() {
        for(int i = 0; i<this.UsedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i <this.UsedSize ; i++) {
            this.elem[i] = null;
        }

    }
}
