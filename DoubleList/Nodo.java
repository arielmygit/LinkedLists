package DoubleList;

public class Nodo {
    int dato;
    Nodo next;
    Nodo back;

    public Nodo(int x){
        this(x,null,null);

    }
    public Nodo(int x, Nodo y, Nodo z) {
        dato = x;
        next = y;
        back = z;
    }
}
