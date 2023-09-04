package ClycicList;

public class Nodo {
    Object dato;
    Nodo enlace;
    Nodo enlaceI_F;

    public Nodo(Object dato) {

        this.dato = dato;
        this.enlace = this;
    }

    public Object getEnlace() {
        return this.enlace;
    }
}
