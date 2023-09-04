package ClycicList;

public class ClylicList {
    private Nodo header;
    private int size;

    public ClylicList() {

        this.header = null;
        this.size = 0;
    }

    public void insert(Object c) {
        Nodo nuevo = new Nodo(c);
        if(header != null) {

            nuevo.enlace = header.enlace;
            header.enlace = nuevo;
            size++;
        }
        else {

            header = nuevo;
            size++;
        }
    }

    public void delete(Object delete) {

        Nodo self = header;

        for(int g = 0; g < size; g++) {
            if(delete.equals(self.dato)) {
                self = self.enlace;
                break;
            }
            self = self.enlace;
        }
        Nodo x = self.enlace;

        if(header == header.enlace) {
            header = null; //
            size--;
        }
        else {
            if(x == header) {
                header = self;
            }
            size--;
            self.enlace = x.enlace;
        }
        x = null;
    }

    public void show() {
        if(header == null) {
            System.out.println("Lista vacia");
        }
        else {
            Nodo tmp = header;

            for(int i = 0; i < size; i++) {
                System.out.println(tmp.dato);
                tmp = tmp.enlace;
            }
        }
    }

    public void find(Object elemento) {


        if(header != null) {
            int y = 0;
            Nodo tmp = header;
            for(int i = 0; i < size; i++) {
                if(elemento.equals(tmp.dato)) {
                    System.out.println(tmp.dato);
                    break;
                }
                y = y + 1;
                tmp = tmp.enlace;
            }

            if(y == size) {
                System.out.println("No se encuentra el elemento");
            }
        }
    }
}
