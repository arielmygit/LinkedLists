package ClycicList;

import java.util.Scanner;

public class Main {

    int select = 0;
    boolean x = true;
    int y = 0;
    Scanner scanner = new Scanner(System.in);
    ClylicList listaCyclic = new ClylicList();

		while(x)

    {

        System.out.print("1.Buscar por index, 2.Mostrar lista completa, 3.Agregar dato, 4.Eliminar dato: ");
        select = scanner.nextInt();

        switch (select) {

            case 1:
                String index;
                System.out.print("Ingresa el index: ");
                index = scanner.next();
                listaCyclic.find(index);
                break;

            case 2:
                listaCyclic.show();
                break;

            case 3:
                String add;
                System.out.print("Ingresa un dato: ");
                add = scanner.next();
                listaCyclic.insert(add);
                break;

            case 4:
                String del;
                System.out.print("Ingrese que elemento se borra: ");
                del = scanner.next();
                listaCyclic.delete(del);
                break;
        }

        System.out.print("10.Continuar, 11. Salir: ");
        y = scanner.nextInt();

        switch (y) {
            case 10:
                x = true;
                break;

            case 11:
                System.out.println("Bye");
                x = false;
                break;
        }
    }
}

