package LinkedList;

public class Nodo {
    Object valor;
    Nodo siguiente;

    public Nodo(Object valor) {
        this.valor=valor;
        this.siguiente=null;

    }
    public Object getValor(){
        return valor;
    }
    public void linkNext(Nodo n){
        siguiente = n;
    }
    public Nodo getNext(){
        return siguiente;
    }
}