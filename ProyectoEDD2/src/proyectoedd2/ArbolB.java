package proyectoedd2;

import java.util.ArrayList;

public class ArbolB {

    public void CrearNodo(int T) {
        Nodo n = new Nodo(T);
    }

    public int buscar(ArrayList<Nodo> x, int llave) {
        int i = 1;
        while (i <= ((int) x.get(i).getLlaves().get(i)) && llave > ((int) x.get(i).getLlaves().get(i))) {
            i = i + 1;
        }
        if (i <= ((int) x.get(i).getLlaves().get(i)) && llave == ((int) x.get(i).getLlaves().get(i))) {
            return (((int) x.get(i).getLlaves().get(i)));
        }
        if (x.get(i).isLeaf()) {
            return 0;
        } else {
            return buscar(x.get(i).getChildren(), llave);
        }
    }

    public void split(Nodo nodo_actual) {
        int orden = nodo_actual.getT()-1;
        int cont=0;
        if (nodo_actual.IsLeaf(true)) {
            if (cont > nodo_actual.getnLlaves()) {
                //entonces se hace el split
            }
        }
    }

}
