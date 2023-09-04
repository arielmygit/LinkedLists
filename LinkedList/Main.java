package LinkedList;

public class Main {
    public static void main(String[] args) {

        // Uso de la clase Nodo
        Nodo uno = new Nodo(1);
        Nodo dos = new Nodo(2);
        Nodo tres = new Nodo(3);

        uno.linkNext(dos);
        uno.getNext().linkNext(tres);

        System.out.println(uno.getNext().getNext().getValor().toString());
        System.out.println(uno.getNext().getValor().toString());
        System.out.println(uno.getValor().toString());

        //Uso de la clase LinkedList
        LinkedList lista = new LinkedList();

        lista.addHeader("Uno");
        lista.addHeader(2);
        lista.addHeader("Tres");
        lista.addHeader(4);
        lista.addHeader("Cinco");
        lista.addHeader(6);

        lista.eliminacion(3);
        System.out.println("Primer elemento: " + lista.acceso(3));
        System.out.println("Tamaño de lista: " + lista.size());


    }
}