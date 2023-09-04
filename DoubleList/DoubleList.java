package DoubleList;

public class DoubleList {
    Nodo inicio;
    Nodo end;

    public DoubleList() {
        inicio = null;
        end = null;
    }

    //Metodo para saber cuando la lista esta vacia
    public boolean isEmpty() {
        return inicio == null;
    }

    public void addAtEnd(int x) {
        if (!isEmpty()) {
            end = new Nodo(x, null, end);
            end.back.next = end;

        } else {
            inicio = end = new Nodo(x);
        }
    }

    public void addAtBegin(int x) {
        if (!isEmpty()) {
            inicio = new Nodo(x, inicio, null);
            inicio.next.back = inicio;

        } else {
            inicio = end = new Nodo(x);
        }
    }

    public void showList() {
        if (!isEmpty()) {
            String values = "//";
            Nodo tmp = inicio;
            while (tmp != null) {
                values = values + "(" + tmp.dato + ")//";
                tmp = tmp.next;
            }
        }
    }

    public int deleteBegin() {
        int valor = inicio.dato;
        if (inicio == end) {
            inicio = end = null;
        } else {
            inicio = inicio.next;
            inicio.back = null;
        }
        return valor;
    }

    public int deleteEnd() {
        int valor = end.dato;
        if (inicio == end) {
            inicio = end = null;
        } else {
            end = end.back;
            end.next = null;
        }
        return valor;
    }

}
