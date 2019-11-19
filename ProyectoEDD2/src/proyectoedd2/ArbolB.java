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

    public void split(Nodo nodo_actual, Metadata value) {
        int orden = nodo_actual.getT()-1;
        int num_llaves = orden;
//        Nodo left = null;
//        Nodo middle = null;
//        Nodo right = null;
        ArrayList<Nodo> Temporal1 = new ArrayList();
        ArrayList<Nodo> Temporal2 = new ArrayList();
        ArrayList<Nodo> Temporal3 = new ArrayList();
        if (nodo_actual.IsLeaf(true)) {
            //if ( > orden) {
                for (int i = 0; i < orden+1; i++) {
                    if (i == orden+1/2) {
                        Temporal2.add(new Nodo(i)); //middle
                    } 
                    else if (i < orden+1/2) {
                        Temporal1.add(new Nodo(i)); //left
                    }
                    else if (i > orden+1/2 && i < orden) {
                        Temporal3.add(new Nodo(i)); //right
                    }
                }                                                
            //}
        }
    }

}
