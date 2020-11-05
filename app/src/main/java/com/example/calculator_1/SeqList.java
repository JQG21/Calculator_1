package com.example.calculator_1;

public class SeqList<T> extends Object{
    protected Object[] element;
    protected int n;
    public SeqList(int length){
        this.element = new Object[length];  //申请数组的存储空间
        this.n = 0;
    }
    public SeqList(){           //创建默认容量的空表，构造方法重载
        this(64);
    }
    public SeqList(T[] values){
        this(values.length);
        System.arraycopy(values, 0, element, 0, values.length);
        this.n = element.length;
    }
    public boolean isEmpty(){
        return this.n == 0;
    }
    public int size(){
        return this.n;
    }
    public void insert(int i, T x){
        if(x==null){
            throw new NullPointerException("x=null");
        }
        if(i<0){
            i=this.n;
        }
        if(i>this.n){
            i=this.n;
        }
        Object[] source = this.element;
        if(this.n==element.length){
            element = new Object[element.length*2];
            System.arraycopy(source, 0, element, 0, element.length);
        }
        if (this.n - 1 >= 0)
            System.arraycopy(source, 1, element, 2, this.n - 1);
        this.element[i] = x;
        this.n++;
    }
    public void insert(T x){
        this.insert(this.n, x);
    }
    @SuppressWarnings("unchecked")
    public T get(int i){
        if(i>=0&&i<this.n){
            return (T)this.element[i];
        }
        else
            return null;
    }
    @SuppressWarnings("unchecked")
    public T remove(int i){
        if(this.n>0&&i>=0&&i<this.n){
            T old =(T)this.element;
            if (this.n - 1 - i >= 0)
                System.arraycopy(this.element, i + 1, this.element, i, this.n - 1 - i);
            this.element[n-1]=null;
            this.n--;
            return old;
        }
        return null;
    }
    public void clear(){
        this.n=0;
    }
}
