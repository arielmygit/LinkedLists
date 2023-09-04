package LinkedList;

public class LinkedList {
    Nodo header;
    int size;

    public LinkedList() {
        header = null;
        size = 0;
    }

    public Object acceso(int index) {
        int contador = 0;
        Nodo temporal = header;
        while (contador < index) {
            temporal = temporal.getNext();
            contador++;
        }
        return temporal.getValor();
    }

    public void addHeader(Object obj) {

        if (header == null) {
            header = new Nodo(obj);
        } else {
            Nodo temp = header;
            Nodo nuevo = new Nodo(obj);
            nuevo.linkNext(temp);
            header = nuevo;
        }
        size++;
    }

    public void eliminacion(int index) {
        if (index == 0) {
            header = header.getNext();
        } else {
            int contador = 0;
            Nodo temporal = header;
            while (contador < index - 1) {
                temporal = temporal.getNext();
                contador++;
            }
            temporal.linkNext(temporal.getNext().getNext());
        }
        size--;
    }
    public int size(){
        return size;
    }




}
