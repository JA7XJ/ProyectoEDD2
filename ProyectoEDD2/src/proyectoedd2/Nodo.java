package proyectoedd2;

import java.io.Serializable;
import java.util.ArrayList;

public class Nodo implements Serializable {

    int nllaves = 0;
    ArrayList<Integer> llaves = new ArrayList<>();
    boolean hoja = true;
    Nodo padre = null;
    ArrayList<Nodo> puntadores = new ArrayList<>();

    public Nodo(int orden) {
        for (int i = 0; i < orden - 1; i++) {
            llaves.add(i, null);
        }
        for (int i = 0; i <= orden; i++) {
            puntadores.add(i, null);
        }
    }

    public void setpadre() {
        for (int i = 0; i < puntadores.size(); i++) {
            puntadores.get(i).padre = this;
        }
    }
}
