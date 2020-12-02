package by.academy.classwork10;

public class Generics<T,V,K> {

    private T t;
    private V v;
    private K k;

    public Generics(T t, V v, K k){

    }

    T returnT(T t){
        return t;
    }

    V returnV(V v){
        return v;
    }

    K returnK(K k){
        return k;
    }

    void printName(){
        System.out.println();
    }

}
